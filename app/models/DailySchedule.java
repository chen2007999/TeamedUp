package models;

import play.db.ebean.*;

import java.lang.Long;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;

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

    @Column(name = "date")
    public Long date;

    @Column(name = "eventId")
    public Long eventId;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public static Finder<Long, DailySchedule> find = new Finder<Long, DailySchedule>(Long.class, DailySchedule.class);

    public static List<Event> findDailySchedule(Client client) {
       String date = Event.currentTime().toString();
       String newDate = Event.getDate(date);
       return Event.find.where().eq("ownerName", client.getName()).eq("date", Event.getValue(newDate)).findList();
    }

    public static void addDailySchedule(Client client, Event event) {
        DailySchedule ds = new DailySchedule();
        ds.setDate(Event.getValue(Event.getDate(Event.getDate(event.getStartTime().toString()))));
        ds.setEventId(event.getId());
        ds.setOwnerName(client.getName());
        ds.save();
    }

    public static void deleteDailySchedule(Client client, Event event) {
        Event e = Event.find.where().eq("ownerName", client.getName()).eq("eventId", event.getId()).findList().get(0);
        e.delete();
    }

}