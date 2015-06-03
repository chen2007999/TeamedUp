package models;

import com.avaje.ebean.bean.EntityBeanIntercept;
import play.db.ebean.Model;

import java.lang.Long;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Id;
import java.lang.String;
import java.util.List;

@Entity
public class Unread extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "userEmail")
    public String userEmail;

    @Column(name = "commentID")
    public Long commentID;

    @Column(name = "taskId")
    public Long taskId;

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;

    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getCommentID() {
        return commentID;
    }

    public Long getTaskId() {
        return taskId;
    }

    public  static Finder<String, Unread> find = new Finder<>(String.class, Unread.class);

    public static void createUnreadTask(Task task, Team team, User user) {
        Unread unread = new Unread();
        List<Team> teams = Team.findTeams(team.getTeamName());
        for(Team teamMember : teams) {
            String email = teamMember.getMemberEmail();
            if(!email.equals(user.getEmail())) {
                unread.setUserEmail(email);
                unread.setTaskId(task.getTaskId());
                unread.save();
            }
        }
    }

    public static void createUnreadComment(Comment comment, Task task, User user) {
        Unread unread = new Unread();
        List<Task> tasks = Task.getTasksWithTaskName(task.getTaskName());
        for(Task taskMember : tasks) {
            String email = taskMember.getInvolvedEmail();
            if(!email.equals(user.getEmail())) {
                unread.setUserEmail(taskMember.getInvolvedEmail());
                unread.setCommentID(comment.getId());
                unread.save();
            }
        }
    }

    public static List<Unread> getUnread(User user) {
        return find.where().eq("userEmail", user.getEmail()).findList();
    }

    public static int getUnreadNum(User user) {
        List<Unread> unreads = getUnread(user);
        return unreads.size();
    }

    public static List<Comment> getUnreadComments(User user) {
        List<Unread> unreads = getUnread(user);
        List<Comment> comments = new ArrayList<Comment>();
        for(Unread unread : unreads) {
            Long commentId = unread.getCommentID();
           if(commentId != null) {
               comments.add(Comment.getCommentById(commentId));
           }
        }
        return comments;
    }

    public static List<Task> getUnreadTasks(User user) {
        List<Unread> unreads = getUnread(user);
        List<Task> tasks = new ArrayList<Task>();
        for(Unread unread : unreads) {
            Long taskId = unread.getTaskId();
            if(taskId != null) {
                tasks.add(Task.getTaskById(taskId));
            }
        }
        return tasks;
    }

    public static void updateUnreadComment(Long commentId) {
        Unread unread = find.where().eq("commentID", commentId).findList().get(0);
        unread.delete();
    }

    public static void updateUnreadTask(Long taskId) {
        Unread unread = find.where().eq("taskId", taskId).findList().get(0);
        unread.delete();
    }

}