package models;

import com.avaje.ebean.bean.EntityBeanIntercept;
import play.db.ebean.Model;

import java.lang.Long;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;
import java.util.Date;

@Entity
public class DailySchedule extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Long getId() {
        return id;
    }

    @Column(name = "ownerName")
    public String ownerName;

    @Column(name = "eventId")
    public Long eventId;

    @Column(name = "date")
    public Date date;

    public  static Finder<Long, DailySchedule> find = new Finder<>(Long.class, DailySchedule.class);

   /* public static void createComment(Comment comment, User user, Task task) {
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
    }*/

}