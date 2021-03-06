package models;

import play.db.ebean.*;

import java.lang.Long;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;

@Entity
public class Comment extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Long getId() {
        return id;
    }

    @Column(name = "ownerName")
    public String ownerName;

    @Column(name = "ownerEmail")
    public String ownerEmail;

    @Column(name = "content")
    public String content;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Column(name = "taskName")
    public String taskName;

    public String getTaskName() {
        return taskName;
    }

    public  static Finder<Long, Comment> find = new Finder<Long, Comment>(Long.class, Comment.class);

    public static void createComment(Comment comment, Client client, Task task) {
        comment.setOwnerEmail(client.getEmail());
        comment.setOwnerName(client.getName());
        comment.setTaskName(task.getTaskName());
        comment.save();
    }

    public static List<Comment> findComments(String taskName) {
        return find.where().eq("taskName", taskName).findList();
    }

    public static Comment getCommentById(Long id) {
        return find.byId(id);
    }

    public static Task findTaskWithId(Long id) {
        return Task.getTasksWithTaskName(find.byId(id).getTaskName()).get(0);
    }

    public static String getTeamName(Long id) {
        return findTaskWithId(id).getTeamName();
    }

}