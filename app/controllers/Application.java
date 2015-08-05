package controllers;

import models.*;

import play.mvc.*;

import java.sql.Timestamp;
import java.util.*;
import play.mvc.Result;
import views.html.*;

import java.lang.String;


public class Application extends Controller {

    /* All these current variables are for the early stage (prototype) showcase purpose.
       They should all be saved as IDs in a session of each user in order to achieve multi-user activities.

       This project was coded in a rush and wasn't designed to be launched. 
       Apologies for not adding session code here.

       To add an ID to client's session:  session().put("clientEmail", client.getEmail());
       To retrieve the ID from the session:    session().get("clientEmail");
       To discard the session:  session().clear();
    */
    public static Client currentClient;
    public static Team currentTeam;
    private static Task currentTask;
    private static Post currentPost;
    public static List<Client> eventClientList = new ArrayList<Client>();

    // index to landing page by default
    public static Result index() {
        return redirect(routes.Application.landing());
    }

    public static Result landing() {
        currentClient = null;
        return ok(landing.render());
    }

    // get the information that the user just typed
    public static Client getUser() {
        play.data.Form<Client> userForm = play.data.Form.form(Client.class);
        return userForm.bindFromRequest().get();
    }

    // methods deal with user account
    public static  Result createUser() {
        
        Client client = getUser();
        if(Client.checkNull(client) || Client.checkEmpty(client)){
            return redirect(routes.Application.register("Empty details"));
        } else if(!client.emailFormat()){
            return redirect(routes.Application.register("Wrong email format"));
        } else if(!Client.checkPasswordConsistency(client)){
            return redirect(routes.Application.register("Passwords do not match"));
        } else if(Client.userEmailExists(client)){
            return redirect(routes.Application.register("Client with email " + client.email + " already exists"));
        }
        Client.createUser(client);
        currentClient = client;
        return ok(mainPage.render(Client.getTeams(currentClient), getUnreadNum()));
    }

    public static  Result deleteUserFromDB(String email) {
        Client.deleteUser(email);
        return redirect(routes.Application.displayAllUsersFromDB());
    }
    
    public static Result deletePost(Long id){
        Post.deletePost(id);
        return redirect(routes.Application.teamPage(currentTeam.teamName));
    }

    public static Result deleteTask(Long id){
        Task.deleteTask(id);
        return redirect(routes.Application.teamPage(currentTeam.teamName));
    }


    public static  Result displayAllUsersFromDB() {
        return ok(registration.render(Client.find.findList(), ""));
    }

    public static Result logIn() {
        Client client = getUser();
        if(Client.validate(client)) {
            currentClient = Client.findUser(client);
            return ok(mainPage.render(Client.getTeams(currentClient), getUnreadNum()));
        }
        return ok(landing.render());
    }

    public  static Result register(String error) {
        return ok(registration.render(Client.find.findList(), error));
    }

    public static Result resetPassword() {
        play.data.Form<Client> userForm = play.data.Form.form(Client.class);
        Client client = userForm.bindFromRequest().get();
        // TODO
        return ok("Not done yet");
    }

   // methods deal with teams
    public static Result mainPage() {
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        currentTeam = null;
        return ok(mainPage.render(Client.getTeams(currentClient), getUnreadNum()));
    }

    public static Result teamPage(String teamName) {
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        eventClientList.clear();
        eventClientList.add(currentClient);
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
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        play.data.Form<Team> teamForm = play.data.Form.form(Team.class);
        Team team = teamForm.bindFromRequest().get();
        if(!Team.teamNameEmpty(team)) {
            Team.createTeam(team, currentClient);
        }
        return redirect(routes.Application.mainPage());
    }
    
    public static Result updateImage(){
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        play.data.Form<Image> userForm = play.data.Form.form(Image.class);
        Image img = userForm.bindFromRequest().get();
        String newimg = img.url;
        if(newimg == null || newimg.length() <= 0){
            newimg = "http://tmdup.com/assets/images/default.jpg";
        }
        Client.updateImage(currentClient, newimg);
        return ok(profile.render(currentClient));
    }
    
    public static Result updateTask(){
        play.data.Form<Description> userForm = play.data.Form.form(Description.class);
        Description description = userForm.bindFromRequest().get();
        String descr = description.descr;
        if(descr.length() > 0){
            Task.updateContent(currentTask, descr);    
        }
        return redirect(routes.Application.taskPage(currentTask.taskName));
    }
    
    public static Result updatePost(){
        play.data.Form<Description> userForm = play.data.Form.form(Description.class);
        Description description = userForm.bindFromRequest().get();
        String descr = description.descr;
        if(descr.length() > 0){
            Post.updateContent(currentPost, descr);    
        }
        return postPage(currentPost.postName);
    }

    public static Result addUserToTeam(String teamName) {
        Client client = getUser();
        if(Client.checkUserEmail(client)) {
            if(Client.userEmailExists(client) && Client.userNotInTheTeam(client, currentTeam)) {
                Team.addUser(client, teamName);
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
            Task.createTask(task, currentTeam, currentClient);
        }
        Unread.createUnreadTask(task, currentTeam, currentClient);
        return redirect(routes.Application.teamPage(currentTeam.getTeamName()));
    }

    public static Result createPost() {
        play.data.Form<Post> postForm = play.data.Form.form(Post.class);
        Post post = postForm.bindFromRequest().get();
        if(!Post.emptyPost(post)) {
            Post.createPost(post, currentTeam, currentClient);
        }
        //Unread.createUnreadTask(task, currentTeam, currentClient);
        return redirect(routes.Application.teamPage(currentTeam.getTeamName()));
    }

    public static Result taskPage(String taskName) {
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        if(currentTeam == null){
            return redirect(routes.Application.mainPage());
        }
        List<Task> tasks = Task.getTasksWithTaskName(taskName);
        currentTask = tasks.get(0);
        List<Comment> comments = Comment.findComments(taskName);
        return ok(taskPage.render(currentTask, comments, currentTeam.getTeamName(), getUnreadNum()));
    }
    
    public static Result postPage(String postName) {
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        if(currentTeam == null){
            return redirect(routes.Application.mainPage());
        }
        List<Post> posts = Post.getPostsWithPostName(postName);
        currentPost = posts.get(0);
        List<Comment> comments = Comment.findComments(postName);
        return ok(postPage.render(currentPost, comments, currentTeam.getTeamName(), getUnreadNum()));
    }

        public static Result markTaskAsDone() {
            if(currentTeam == null){
                return redirect(routes.Application.mainPage());
            }
            Task.updateStatus(currentTask, "Complete");
            return redirect(routes.Application.teamPage(currentTeam.getTeamName()));
        }

        public static Result markTaskAsDoing() {
            if(currentTeam == null){
                return redirect(routes.Application.mainPage());
            }
            Task.updateStatus(currentTask, "In Progress");
            return redirect(routes.Application.taskPage(currentTask.getTaskName()));
        }

    // methods deal with comments
    public static Result createComment(Long currentTaskId) {
        play.data.Form<Comment> commentForm = play.data.Form.form(Comment.class);
        Comment comment = commentForm.bindFromRequest().get();
        Task task = Task.getTaskById(currentTaskId);
        Comment.createComment(comment, currentClient, task);
        Task.addTask(task, currentTeam, currentClient);
        Unread.createUnreadComment(comment, task, currentClient);
        return redirect(routes.Application.taskPage(task.getTaskName()));
    }

    public static int getUnreadNum() {
        return Unread.getUnreadNum(currentClient);
    }

    public static Result unreadPage() {
        return ok(unreadPage.render(getUnreadComments(), getUnreadTasks(), getUnreadEvents()));
    }
    
    public static Result test() {
        return ok(test.render());
    }

    public static List<Event> getUnreadEvents() {
        return Unread.getUnreadEvents(currentClient);
    }

    public static List<Comment> getUnreadComments() {
        return Unread.getUnreadComments(currentClient);
    }

    public static List<Task> getUnreadTasks() {
        return Unread.getUnreadTasks(currentClient);
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

    public static Result redirectUnreadEvent(Long eventId) {
        Event event = Event.getEventWithId(eventId);
        Unread.updateUnreadEvent(eventId, currentClient);
        return redirect(routes.Application.showEventInfo(event.getEventName()));
    }

    public static Result createEvent(String startTime, String slotChosen) {
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        play.data.Form<Event> eventForm = play.data.Form.form(Event.class);
        Event event = eventForm.bindFromRequest().get();
        if (!Event.nullEvent(event) && !Event.emptyEvent(event)) {
            Timestamp start = Timestamp.valueOf(startTime + "00:00:00.0");
            event.setStartTime(start);
            Event.createEvent(event, currentClient, eventClientList);

            eventClientList.clear();
            eventClientList.add(currentClient);
            return redirect(routes.Application.showEventInfo(event.getEventName()));
        }
        int startHour = Integer.parseInt(slotChosen.substring(11, 13));
        int endHour = Integer.parseInt(slotChosen.substring(19, 21));
        List<Integer> startHours = new ArrayList<Integer>();
        List<Integer> endHours = new ArrayList<Integer>();
        for(int i=startHour; i<endHour; i++) {
            startHours.add(i);
        }
        for(int i=startHour+1; i<=endHour; i++) {
            endHours.add(i);
        }
        return ok(createEvent.render(getUnreadNum(), startTime, "error", startHours, endHours, slotChosen));

    }

    public static Result eventPage() {
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        if(currentTeam == null){
            return redirect(routes.Application.mainPage());
        }
        return ok(eventPage.render(eventClientList, currentTeam.getTeamName(),getUnreadNum()));
    }

    private static boolean userNotInTheEventList(Client client) {
        String email = client.getEmail();
        for(Client u : eventClientList) {
            if(u.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public static Result addUserToEvent() {
        Client client = getUser();
        if(Client.checkUserEmail(client)) {
            if(Client.userEmailExists(client) && userNotInTheEventList(client)) {
                eventClientList.add(client);
            }
        }
        return redirect(routes.Application.eventPage());
    }


    public static Result commonTimeList() {
        List<TimePair> tp = Event.findWeeklyCommonFreetime(eventClientList, Event.currentDate());
        List<String> s = Event.timeListToString(tp);
        return ok(commonTime.render());
    }

    public static Result chooseCommonTime(String slotChosen) {
        String startTime = slotChosen.substring(0, 11);
        int startHour = Integer.parseInt(slotChosen.substring(11, 13));
        int endHour = Integer.parseInt(slotChosen.substring(19, 21));
        List<Integer> startHours = new ArrayList<Integer>();
        List<Integer> endHours = new ArrayList<Integer>();
        for(int i=startHour; i<endHour; i++) {
            startHours.add(i);
        }
        for(int i=startHour+1; i<=endHour; i++) {
            endHours.add(i);
        }
        return ok(createEvent.render(getUnreadNum(), startTime, "", startHours, endHours, slotChosen));
    }

    
    public static Result profile(String email) {
        Client client = Client.findUserByEmail(email);
        return ok(profile.render(client));
    }

    public static Result deleteUserFromEventList(String email) {
        Client u = new Client();
        for(Client client : eventClientList) {
            if(client.getEmail().equals(email)) {
                u = client;
            }
        }
        eventClientList.remove(u);
        return ok(eventPage.render(eventClientList, currentTeam.getTeamName(), getUnreadNum()));
    }

    public static Result showEventInfo(String eventName) {
        Event event = Event.find.where().eq("eventName", eventName).findList().get(0);
        String date = event.getStartTime().toString().substring(0, 11);
        String startTime = event.getStartTime().toString().substring(11, 16);
        String endTime = event.getEndTime().toString().substring(11, 16);
        List<Event> events = Event.find.where().eq("eventName", eventName).eq("ownerName", event.getOwnerName()).findList();
        return ok(showEventInfo.render(event, date, startTime, endTime, events));
    }

    public static Result dailySchedule() {
        if(currentClient == null){
            return redirect(routes.Application.landing());
        }
        List<Event> events = Event.findDailySchedule(currentClient);
        return ok(dailySchedule.render(events));
    }
    
    public static Result logout() {
        return redirect(routes.Application.landing());
    }
}