package models;

import com.avaje.ebean.bean.EntityBeanIntercept;
import play.db.ebean.Model;

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

    @Column(name = "content")
    public String content;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Column(name = "taskName")
    public String taskName;

    public String getTaskName() {
        return taskName;
    }

    public  static Finder<Long, Comment> find = new Finder<>(Long.class, Comment.class);

    public static void createComment(Comment comment, User user, Task task) {
        comment.setOwnerName(user.getName());
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