package models;

import play.db.ebean.*;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;
import java.util.List;

@Entity
public class Task extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long taskId;

    @Column(name = "taskName")
    public String taskName;

    public String getTeamName() {
        return teamName;
    }

    @Column(name = "teamName")

    public String teamName;

    @Column(name = "content")
    public String content;

    public String getTaskName() {
        return taskName;
    }

    public String getContent() {
        return content;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setInvolvedEmail(String involvedEmail) {
        this.involvedEmail = involvedEmail;
    }

    @Column(name = "involvedEmail")
    public String involvedEmail;

    public String getInvolvedEmail() {
        return involvedEmail;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "status")
    public String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static void updateStatus(Task task, String status) {
        task.setStatus(status);
        task.update();
    }

    public static Finder<Long, Task> find = new Finder<Long, Task>(Long.class, Task.class);

    public static void createTask(Task task, Team team, Client client) {
        task.setTeamName(team.getTeamName());
        task.setInvolvedEmail(client.getEmail());
        task.setStatus("In Progress");
        task.save();
    }

    public static void addTask (Task task, Team team, Client client) {
        if(find.where().eq("involvedEmail", client.getEmail()).findList().size() == 0) {
            Task addingTask = addTaskHelper(task, team, client);
            addingTask.setInvolvedEmail(client.getEmail());
            addingTask.save();
        }
    }

    public static Task addTaskHelper(Task task, Team team, Client client) {
        Task addingTask = new Task();
        addingTask.setTaskName(task.getTaskName());
        addingTask.setStatus(task.getStatus());
        addingTask.setTeamName(team.getTeamName());
        addingTask.setContent(task.getContent());
        return addingTask;
    }

    public static boolean emptyTask(Task task) {
        return task.getTaskName().equals("") || task.getContent().equals("");
    }

    public static List<Task> getTasksWithTaskName(String taskName) {
        return find.where().eq("taskName", taskName).findList();
    }

    public static List<Task> getTasksWithTeamName(String teamName) {
        List<Task> tasks = find.where().eq("teamName", teamName).findList();
        List<Task> result = new ArrayList<Task>();
        for(Task task : tasks) {
            boolean notContains = true;
            for(Task resultTask : result) {
                if(resultTask.getTaskName().equals(task.getTaskName())) {
                    notContains = false;
                }
            }
            if(notContains) {
                result.add(task);
            }
        }
        return  result;
    }

    public static Task getTaskWithTaskName(String taskName) {
        return find.where().eq("taskName", taskName).findList().get(0);
    }

    public static Task getTaskById(Long taskId) {
        return find.byId(taskId);
    }
}