package controllers;

import models.*;
import play.data.*;

import play.mvc.*;

import java.sql.Timestamp;
import java.util.*;
import play.mvc.Result;
import play.mvc.Results;
import views.html.*;

import java.lang.String;


public class Application extends Controller {

    private static User currentUser;
    private static Team currentTeam;
    private static Task currentTask;
    private static Post currentPost;
    private static Event currentEvent;
    private static List<User> eventUserList = new ArrayList<User>();
    
    
    

    // index to landing page by default
    public static Result index() {
        return redirect(routes.Application.landing());
    }

    public static Result landing() {
        currentUser = null;
        return ok(landing.render());
    }

    // get the information that the user just typed
    public static User getUser() {
        play.data.Form<User> userForm = play.data.Form.form(User.class);
        return userForm.bindFromRequest().get();
    }

    // methods deal with user account
    public static  Result createUser() {
        
        User user = getUser();
        if(User.checkNull(user) || User.checkEmpty(user)){
            return redirect(routes.Application.register("Empty details"));
        } else if(!user.emailFormat()){
            return redirect(routes.Application.register("Wrong email format"));
        } else if(!User.checkPasswordConsistency(user)){
            return redirect(routes.Application.register("Passwords do not match"));
        } else if(User.userEmailExists(user)){
            return redirect(routes.Application.register("User with email " + user.email + " already exists"));
        }
        User.createUser(user);
        return redirect(routes.Application.displayAllUsersFromDB());
    }

    public static  Result deleteUserFromDB(String email) {
        User.deleteUser(email);
        return redirect(routes.Application.displayAllUsersFromDB());
    }

    public static  Result displayAllUsersFromDB() {
        return ok(registration.render(User.find.findList(), ""));
    }

    public static Result logIn() {
        User user = getUser();
        if(User.validate(user)) {
            currentUser = User.findUser(user);
            return ok(mainPage.render(User.getTeams(currentUser), getUnreadNum()));
        }
        return ok(landing.render());
    }

    public  static Result register(String error) {
        return ok(registration.render(User.find.findList(), error));
    }

    public static Result resetPassword() {
        play.data.Form<User> userForm = play.data.Form.form(User.class);
        User user = userForm.bindFromRequest().get();
        // TODO
        return ok("Not done yet");
    }

   /* public static Result resetName() {
        play.data.Form<User> userForm = play.data.Form.form(User.class);
        User user = userForm.bindFromRequest().get();
        User.setName(user.getName());
    }*/


   // methods deal with teams
    public static Result mainPage() {
        currentTeam = null;
        return ok(mainPage.render(User.getTeams(currentUser), getUnreadNum()));
    }

    public static Result teamPage(String teamName) {
        eventUserList.clear();
        eventUserList.add(currentUser);
        List<Team> teams = Team.findTeams(teamName);
        if(teams.size() == 0) {
            return redirect(routes.Application.mainPage());
        }
        currentTeam = teams.get(0);
        currentTask = null;
        List<Task> tasks = Task.getTasksWithTeamName(teamName);
        List<Post> posts = Post.getPostsWithTeamName(teamName);
        return ok(teamPage.render(teamName, teams, tasks, posts, getUnreadNum()));
    }

    public static Result createTeam() {
        play.data.Form<Team> teamForm = play.data.Form.form(Team.class);
        Team team = teamForm.bindFromRequest().get();
        if(!Team.teamNameEmpty(team)) {
            Team.createTeam(team, currentUser);
        }
        return redirect(routes.Application.mainPage());
    }
    
    public static Result updateImage(){
        play.data.Form<String> userForm = play.data.Form.form(String.class);
        String newimg = userForm.bindFromRequest().get();
        if(newimg == null){
            newimg = "http://www.filecluster.com/howto/wp-content/uploads/2014/07/User-Default.jpg";
        }
        currentUser.setImage(newimg);
        return redirect(routes.Application.profile());
    }

    public static Result addUserToTeam(String teamName) {
        User user = getUser();
        if(User.checkUserEmail(user)) {
            if(User.userEmailExists(user) && User.userNotInTheTeam(user, currentTeam)) {
                Team.addUser(user, teamName);
            }
        }
        return redirect(routes.Application.teamPage(teamName));
    }

    public static Result deleteUserFromTeam(String email) {
        Team.deleteUser(email, currentTeam.getTeamName());
        return redirect(routes.Application.teamPage(currentTeam.getTeamName()));
    }

    // methods deal with tasks
    public static  Result taskCreationPage() {
        return ok(createTask.render(currentTeam, getUnreadNum()));
    }

    public static Result createTask() {
        play.data.Form<Task> taskForm = play.data.Form.form(Task.class);
        Task task = taskForm.bindFromRequest().get();
        if(!Task.emptyTask(task)) {
            Task.createTask(task, currentTeam, currentUser);
        }
        Unread.createUnreadTask(task, currentTeam, currentUser);
        return redirect(routes.Application.teamPage(currentTeam.getTeamName()));
    }

    public static Result createPost() {
        play.data.Form<Post> postForm = play.data.Form.form(Post.class);
        Post post = postForm.bindFromRequest().get();
        if(!Post.emptyPost(post)) {
            Post.createPost(post, currentTeam, currentUser);
        }
        //Unread.createUnreadTask(task, currentTeam, currentUser);
        return redirect(routes.Application.teamPage(currentTeam.getTeamName()));
    }

    public static Result taskPage(String taskName) {
        List<Task> tasks = Task.getTasksWithTaskName(taskName);
        currentTask = tasks.get(0);
        List<Comment> comments = Comment.findComments(taskName);
        return ok(taskPage.render(currentTask, comments, currentTeam.getTeamName(), getUnreadNum()));
    }
    
    public static Result postPage(String postName) {
        List<Post> posts = Post.getPostsWithPostName(postName);
        currentPost = posts.get(0);
        List<Comment> comments = Comment.findComments(postName);
        return ok(postPage.render(currentPost, comments, currentTeam.getTeamName(), getUnreadNum()));
    }

        public static Result markTaskAsDone() {
            Task.updateStatus(currentTask, "Complete");
            return redirect(routes.Application.teamPage(currentTeam.getTeamName()));
        }

        public static Result markTaskAsDoing() {
            Task.updateStatus(currentTask, "In Progress");
            return redirect(routes.Application.taskPage(currentTask.getTaskName()));
        }

    // methods deal with comments
    public static Result createComment(Long currentTaskId) {
        play.data.Form<Comment> commentForm = play.data.Form.form(Comment.class);
        Comment comment = commentForm.bindFromRequest().get();
        Task task = Task.getTaskById(currentTaskId);
        Comment.createComment(comment, currentUser, task);
        Task.addTask(task, currentTeam, currentUser);
        Unread.createUnreadComment(comment, task, currentUser);
        return redirect(routes.Application.taskPage(task.getTaskName()));
    }

    public static int getUnreadNum() {
        return Unread.getUnreadNum(currentUser);
    }

    public static Result unreadPage() {
        return ok(unreadPage.render(getUnreadComments(), getUnreadTasks()));
    }
    
    public static Result test() {
        return ok(test.render());
    }

    public static List<Comment> getUnreadComments() {
        return Unread.getUnreadComments(currentUser);
    }

    public static List<Task> getUnreadTasks() {
        return Unread.getUnreadTasks(currentUser);
    }

    public static Result redirectUnreadComment(Long commentId) {
        Comment comment = Comment.find.byId(commentId);
        String taskName = comment.getTaskName();
        Task task = Task.getTaskWithTaskName(taskName);
        List<Comment> comments = Comment.findComments(taskName);
        String teamName = task.getTeamName();
        Unread.updateUnreadComment(commentId);
        return ok(taskPage.render(task, comments, teamName, getUnreadNum()));
    }

    public static Result redirectUnreadTask(Long taskId) {
        Task task = Task.getTaskById(taskId);
        String teamName = task.getTeamName();
        List<Comment> comments = Comment.findComments(task.getTaskName());
        Unread.updateUnreadTask(taskId);
        return ok(taskPage.render(task, comments, teamName, getUnreadNum()));
    }

    public static Result createEventPage() {
        return ok("");
        //return ok(createEvent.render(getUnreadNum()));
    }

    public static Result createEvent(String startTime, String availableHours) {
        play.data.Form<Event> eventForm = play.data.Form.form(Event.class);
        Event event = eventForm.bindFromRequest().get();
        Timestamp start = Timestamp.valueOf(startTime + ":00.0");
        event.setStartTime(start);
        if (!Event.emptyEvent(event) && !Event.nullEvent(event)) {
            //if (event.checkTime(event.getStartTimeString(), event.getEndTimeString())) {
                Event.createEvent(event, currentUser, eventUserList);
                //currentEvent = event;
            eventUserList.clear();
            eventUserList.add(currentUser);
                return ok(popUp.render(currentTeam.getTeamName()));
            //}
        }
        return ok(createEvent.render(getUnreadNum(), startTime, availableHours));
       // return ok("todo");
    }

    public static Result eventPage() {
        return ok(eventPage.render(eventUserList, currentTeam.getTeamName()));
    }

    private static boolean userNotInTheEventList(User user) {
        String email = user.getEmail();
        for(User u : eventUserList) {
            if(u.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public static Result addUserToEvent() {
        User user = getUser();
        if(User.checkUserEmail(user)) {
            if(User.userEmailExists(user) && userNotInTheEventList(user)) {
                eventUserList.add(user);
            }
        }
        return redirect(routes.Application.eventPage());
    }


    public static Result commonTimeList() {
        List<TimePair> tp = Event.findWeeklyCommonFreetime(eventUserList, Event.currentDate());
        List<String> s = Event.timeListToString(tp);
        return ok(commonTime.render(s));
    }

    public static Result chooseCommonTime(String slotChosen) {
        String startTime = slotChosen.substring(0, 16);
        Long availableHours = Event.getValue(slotChosen.substring(35, 37))
                - Event.getValue(slotChosen.substring(11, 13));
        String availableHoursString = availableHours.toString();
        return ok(createEvent.render(getUnreadNum(), startTime, availableHoursString));
    }

    
    public static Result profile() {
        User user = getUser();
        if(User.validate(user)) {
            currentUser = User.findUser(user);
        }
        return ok(profile.render(currentUser));
    }

    public static Result deleteUserFromEventList(String email) {
        User u = new User();
        for(User user : eventUserList) {
            if(user.getEmail().equals(email)) {
                u = user;
            }
        }
        eventUserList.remove(u);
        return ok(eventPage.render(eventUserList, currentTeam.getTeamName()));
    }



    /*<h2>Event Name: @event.eventName </h2>
    <h2> Description: @event.content </h2>
    <h2> Start Time: @event.startTimeString</h2>
    <h2> End Time: @event.endTimeString</h2>
    <h2> Created by @event.ownerName</h2>*/

}





