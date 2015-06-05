package models;

import com.avaje.ebean.bean.EntityBeanIntercept;
import play.db.ebean.Model;

import java.lang.Long;
import java.sql.Timestamp;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;
import java.util.Date;
import java.util.Locale;

@Entity
public class Event extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Long getId() {
        return id;
    }

    @Column(name = "eventName")
    public String eventName;

    @Column(name = "ownerName")
    public String ownerName;

    @Column(name = "involvedEmail")
    public String involvedEmail;

    @Column(name = "startTimeString")
    public String startTimeString;

    @Column(name = "endTimeString")
    public String endTimeString;

    @Column(name = "startTime")
    public Timestamp startTime;

    @Column(name = "endTime")
    public Timestamp endTime;

    @Column(name = "content")
    public String content;

    // setters and getters for Event attributes
    public  static Finder<Long, Event> find = new Finder<>(Long.class, Event.class);

    public String getStartTimeString() {
        return startTimeString;
    }

    public String getEndTimeString() {
        return endTimeString;
    }

    public String getEventName() {
        return eventName;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getInvolvedEmail() {
        return involvedEmail;
    }

    public void setInvolvedEmail(String involvedEmail) {
        this.involvedEmail = involvedEmail;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setStartTimeString(String startTimeString) {
        this.startTimeString = startTimeString;
    }

    public void setEndTimeString(String endTimeString) {
        this.endTimeString = endTimeString;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public String getContent() {
        return content;
    }

    public static void createEvent(Event event, User user) {
        event.setEndTime(Timestamp.valueOf(event.getEndTimeString() + ":00.0"));
        event.setStartTime(Timestamp.valueOf(event.getStartTimeString() + ":00.0"));
        event.setOwnerName(user.getName());
        event.setInvolvedEmail(user.getEmail());
        event.save();
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public static Timestamp currentTime() {
        Date date= new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        return ts;
    }

    public static boolean checkTime(String startTimeString, String endTimeString) {
        if(checkTimeHelper(startTimeString) && checkTimeHelper(endTimeString)) {
            Long startTime = getValue(getNewTimeString(startTimeString));
            Long endTime = getValue(getNewTimeString(endTimeString));
            if(endTime > startTime) {
                return true;
            }
        }
        return  false;
    }

    public static boolean checkTimeHelper(String time) {
        if(time.length() != 16) {
            return false;
        }
        if(time.charAt(4) != '-' || time.charAt(7) != '-' || time.charAt(13) != ':') {
            return false;
        }
        String currentTime = currentTime().toString().substring(0, 17);
        String newCurrentTime = getNewTimeString(currentTime);
        String newTime = getNewTimeString(time);
        if(getValue(newTime) < getValue(newCurrentTime)) {
            return false;
        }
        Long year = getValue(time.substring(0, 4));
        Long month = getValue(time.substring(5, 7));
        Long day = getValue(time.substring(8, 10));
        Long hour = getValue(time.substring(11, 13));
        Long minute = getValue(time.substring(14, 16));

        if(year > 9999 || month > 12 || day > 31 || hour > 23 || minute > 59) {
            return false;
        }
        if(month == 2 && day > 28) {
            return false;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            if(day > 30) {
                return false;
            }
        }
        return true;
    }

    public static String getNewTimeString(String time) {
        return time.substring(0, 4) + time.substring(5, 7) +
                time.substring(8, 10) + time.substring(11, 13) + time.substring(14, 16);
    }

    public static long getValue(String s) {
        return Long.parseLong(s);
    }

    public static boolean emptyEvent(Event event) {
        return event.getEventName().equals("") || event.getStartTimeString().equals("") ||
                event.getEndTimeString().equals("");
    }

    public static Event getEventWithId(Long id) {
        return find.byId(id);
    }

    public static List<Event> findEvents(String eventName) {
        return find.where().eq("eventName", eventName).findList();

    }

    public static void addUser(User user, Event event) {
        Event newEvent = new Event();
        newEvent.setInvolvedEmail(user.getEmail());
        newEvent.setEventName(event.getEventName());
        newEvent.setContent(event.getContent());
        newEvent.setOwnerName(event.getOwnerName());
        newEvent.setEndTime(event.getEndTime());
        newEvent.setStartTime(event.getStartTime());
        newEvent.setEndTimeString(event.getEndTimeString());
        newEvent.setStartTimeString(event.getStartTimeString());
        newEvent.save();
    }


    public static List<TimePair> findWeeklyFreeTime(User user) {
        // loop through user's booked time in seven days from now on
        // and return a list of TimePair, each pair represents a free time interval
        // two values in a time pair represents the boudary between free time and adjacent booked time
        return null;
    }

    public static List<TimePair> findWeeklyCommonFreeTime(List<User> users) {
        // use the method above find each user's weekly free time
        // somehow somehow somehow find the list of common free time for the upcoming week

        return null;
    }


}