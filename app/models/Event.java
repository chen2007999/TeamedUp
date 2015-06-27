package models;

import play.db.ebean.*;

import java.lang.Integer;
import java.lang.Long;
import java.sql.Timestamp;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

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

    @Column(name = "startTime")
    public Timestamp startTime;

    @Column(name = "endTime")
    public Timestamp endTime;

    @Column(name = "slotChosenStart")
    public String slotChosenStart;

    @Column(name = "slotChosenEnd")
    public String slotChosenEnd;

    @Column(name = "location")
    public String location;

    @Column(name = "content")
    public String content;

    // setters and getters for Event attributes
    public  static Finder<Long, Event> find = new Finder<Long, Event>(Long.class, Event.class);

    public String getEventName() {
        return eventName;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
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


    public void setLocation(String location) {
        this.location = location;
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

    public String getSlotChosenStart() {
        return slotChosenStart;
    }

    public String getSlotChosenEnd() {
        return slotChosenEnd;
    }
    
    public static void createEvent(Event event, Client creator, List<Client> client) {
        String start = event.getStartTime().toString();
        String newStart = start.substring(0, 11) + event.getSlotChosenStart() + ":00:00.0";
        String newEnd = start.substring(0, 11) + event.getSlotChosenEnd() + ":00:00.0";
        Timestamp startTs = Timestamp.valueOf(newStart);
        Timestamp endTs = Timestamp.valueOf(newEnd);

        for(Client u : client) {
            Event e = new Event();
            e.setEventName(event.getEventName());
            e.setContent(event.getContent());
            e.setOwnerName(creator.getName());
            e.setLocation(event.getLocation());

            e.setStartTime(event.getStartTime());
            e.setStartTime(startTs);
            e.setEndTime(endTs);
            e.setInvolvedEmail(u.getEmail());
            e.save();
            Unread.createUnreadEvent(e, u);

        }

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

    public static String currentDate() {
        return getDate(currentTime().toString());
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

    public static Long getValue(String s) {
        return Long.parseLong(s);
    }

    public static boolean nullEvent(Event event) {
        return event.getEventName() == null  || event.getLocation() == null;
    }

    public static boolean emptyEvent(Event event) {
                return event.getEventName().equals("") || event.getLocation().equals("");

    }

    public static Event getEventWithId(Long id) {
        return find.byId(id);
    }

    public static List<Event> findEvents(String eventName) {
        return find.where().eq("eventName", eventName).findList();

    }

    public static void addUser(Client client, Event event) {
        Event newEvent = new Event();
        newEvent.setInvolvedEmail(client.getEmail());
        newEvent.setEventName(event.getEventName());
        newEvent.setContent(event.getContent());
        newEvent.setOwnerName(event.getOwnerName());
        newEvent.setEndTime(event.getEndTime());
        newEvent.setStartTime(event.getStartTime());
        newEvent.save();
    }

    public static String getDate(String time) {
        return time.substring(0, 4) + time.substring(5, 7) +
                time.substring(8, 10);
    }


    public static String increaseDate(String inputDate, int num) {
        Long date = getValue(inputDate);
        Long day = getValue(inputDate.substring(6));
        Long month = getValue(inputDate.substring(4, 6));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if(month == 2) {
            date = addDate(date, num, 28);
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            date = addDate(date, num, 30);
        } else {
            date = addDate(date, num, 31);
        }
        sb.append(date);
        return sb.toString();
    }

    private static Long addDate(Long input, int num, int thresh) {
        Long ym = input / 100;
        Long d = input % 100;
        ym += (d+num) / thresh;
        d = (d+num) % thresh;
        return ym * 100 + d;
    }

    public static List<TimePair> findWeeklyScheduledTime(Client client, String date) {
        List<Event> events = new ArrayList<Event>();
        for(int i=0; i<7; i++) {
            List<Event> subEvents = find.where().eq("involvedEmail", client.getEmail()).findList();
            for(Event e : subEvents) {
                if(getDate(e.getStartTime().toString()).equals(date)) {
                    Long eStartTime = getValue(getNewTimeString(e.getStartTime().toString()));
                    Long eEndTime = getValue(getNewTimeString(e.getEndTime().toString()));
                    Long currentTime = getValue(getNewTimeString(currentTime().toString()));
                    if(eEndTime > currentTime) {
                        events.add(e);
                    }
                }
            }
            date = increaseDate(date, 1);
        }
        List<TimePair> timeScheduled = new ArrayList<TimePair>();
        for(Event event : events) {
            TimePair timepair = new TimePair(event.getStartTime(), event.getEndTime());
            timeScheduled.add(timepair);
        }
        return timeScheduled;
    }


    public static List<TimePair> findWeeklyScheduledTimeUnion(List<Client> clients, String date) {
        List<TimePair> timeScheduled = new ArrayList<TimePair>();
        for(Client client : clients) {
            if(findWeeklyScheduledTime(client, date) != null) {
                timeScheduled.addAll(findWeeklyScheduledTime(client, date));
            }
        }
        Collections.sort(timeScheduled, new TimeComparator());
        List<TimePair> timeScheduledUnion = new ArrayList<TimePair>();

        for(int i=0; i+1<timeScheduled.size(); i++) {
            if(TimePair.contains(timeScheduled.get(i), timeScheduled.get(i+1))) {
                timeScheduled.set(i+1, TimePair.containsResult(timeScheduled.get(i), timeScheduled.get(i + 1)));
            } else if(TimePair.overlapsNotContains(timeScheduled.get(i), timeScheduled.get(i+1))) {
                TimePair tp = new TimePair(timeScheduled.get(i).getStart(), timeScheduled.get(i+1).getEnd());
                timeScheduled.set(i+1, tp);
            } else {
                timeScheduledUnion.add(timeScheduled.get(i));
            }
        }
        if(timeScheduledUnion != null && timeScheduled.size() > 0) {
            timeScheduledUnion.add(timeScheduled.get(timeScheduled.size() - 1));
        }
        return timeScheduledUnion;
    }

    public static List<TimePair> findDailyFreeTP(List<TimePair> dailyScheduledTP) {
        List<TimePair> result = new ArrayList<TimePair>();
        String firstEventStartTime = dailyScheduledTP.get(0).getStart().toString();
        String firstEventStartHour = firstEventStartTime.substring(11, 13) + firstEventStartTime.substring(14, 16);

        if(getDate(dailyScheduledTP.get(0).getStart().toString()).equals(currentDate())) {

            int currentHour = Integer.parseInt(currentTime().toString().substring(11, 13)) + 2;

            if(getValue(firstEventStartTime.substring(11, 13)) > currentHour) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(currentHour);
                Timestamp ts = Timestamp.valueOf(firstEventStartTime.substring(0, 11) + sb.toString() + ":00:00.0");
                TimePair tp = new TimePair(ts, dailyScheduledTP.get(0).getStart());
                result.add(tp);
            }
        } else if (getValue(firstEventStartHour) > 800) {
            Timestamp ts = Timestamp.valueOf(firstEventStartTime.substring(0, 10) + " 08:00:00.0");
            TimePair tp = new TimePair(ts, dailyScheduledTP.get(0).getStart());
            result.add(tp);
        }
        for(int i=0; i+1<dailyScheduledTP.size(); i++) {
            if (TimePair.sameDay(dailyScheduledTP.get(i), dailyScheduledTP.get(i + 1))) {
                TimePair tp = new TimePair(dailyScheduledTP.get(i).getEnd(), dailyScheduledTP.get(i + 1).getStart());
                result.add(tp);
            }
        }
        String lastEventEndTime = dailyScheduledTP.get(dailyScheduledTP.size()-1).getEnd().toString();
        String lastEventEndHour = lastEventEndTime.substring(11, 13) + lastEventEndTime.substring(14, 16);
        if (getValue(lastEventEndHour) < 2100) {
            Timestamp ts = Timestamp.valueOf(lastEventEndTime.substring(0, 10) + " 21:00:00.0");
            TimePair tp = new TimePair(dailyScheduledTP.get(dailyScheduledTP.size() - 1).getEnd(), ts);
            result.add(tp);
        }
        return result;
    }

    public static List<TimePair> findWeeklyCommonFreetime(List<Client> clients, String date) {
        List<TimePair> weeklyCommonFreeTime = new ArrayList<TimePair>();
        List<TimePair> timeScheduledUnion = findWeeklyScheduledTimeUnion(clients, date);
        if(timeScheduledUnion != null && timeScheduledUnion.size() > 0) {
            for(int j=0; j<7; j++) {
                List<TimePair> dailyScheduledTP = new ArrayList<TimePair>();
                for (int i = 0; i < timeScheduledUnion.size(); i++) {
                    String elementDate = getDate(timeScheduledUnion.get(i).getStart().toString());
                    if(elementDate.equals(date)) {
                          dailyScheduledTP.add(timeScheduledUnion.get(i));
                    }
                }
                if(dailyScheduledTP.size() > 0) {
                    List<TimePair> dailyFreeTP = findDailyFreeTP(dailyScheduledTP);

                    if (dailyFreeTP != null) {
                        for(TimePair var : dailyFreeTP) {
                            if(TimePair.tpNotOutDated(var)) {
                                weeklyCommonFreeTime.add(var);
                            }
                        }
                    }
                    timeScheduledUnion.removeAll(dailyScheduledTP);

                } else {
                    TimePair wholeDayFreeTP = createFreeDaySlot(date);
                    if(TimePair.tpNotOutDated(wholeDayFreeTP)) {
                        weeklyCommonFreeTime.add(wholeDayFreeTP);
                    }
                }
                date = increaseDate(date, 1);
            }
        } else {
            String curHour = currentTime().toString().substring(11, 13);
            int curHourInt = Integer.parseInt(curHour);
            if(curHourInt+1 < 21) {
                String time = "";
                if (curHourInt + 1 < 10) {
                    time = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8)
                            + " " + "0" + Integer.toString(curHourInt + 1) + ":00:00.0";
                } else {
                    time = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8)
                            + " " + Integer.toString(curHourInt + 2) + ":00:00.0";
                }
                String endToday = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8)
                        + " 21" + ":00:00.0";

                Timestamp tsStart = Timestamp.valueOf(time);
                Timestamp tsEnd = Timestamp.valueOf(endToday);
                TimePair tpToday = new TimePair(tsStart, tsEnd);

                weeklyCommonFreeTime.add(tpToday);
            }
            String dateVar = increaseDate(currentDate(), 1);
            // adding daily slots for the week
            for(int i=0; i<6; i++) {
                weeklyCommonFreeTime.add(createFreeDaySlot(dateVar));
                dateVar = increaseDate(dateVar, 1);
            }
        }
        return weeklyCommonFreeTime;
    }

    public static TimePair createFreeDaySlot(String dateVar) {
        String startDaily = dateVar.substring(0, 4) + "-" + dateVar.substring(4, 6) + "-" + dateVar.substring(6, 8)
                + " 08" + ":00:00.0";
        String endDaily = dateVar.substring(0, 4) + "-" + dateVar.substring(4, 6) + "-" + dateVar.substring(6, 8)
                + " 21" + ":00:00.0";
        Timestamp dailyStart = Timestamp.valueOf(startDaily);
        Timestamp dailyEnd = Timestamp.valueOf(endDaily);
        TimePair tpDaily = new TimePair(dailyStart, dailyEnd);
        return tpDaily;
    }

    /*private static List<TimePair> hourlyTimeSlots(List<TimePair> unionList) {
        List<TimePair> result = new ArrayList<TimePair>();
        for(TimePair tp : unionList) {
            TimePair var = TimePair.firstHourInTheSlot(tp);
            result.add(var);
            for(int i=0; i<TimePair.interval(tp); i++) {
                var = TimePair.increment(var);
                result.add(var);
            }

        }
        return result;
    }*/

   /* private static List<TimePair> dailyFreeSlots(String date) {
        List<Timestamp> temp = new ArrayList<Timestamp>();
        for(int i=8; i<=21; i++) {
            String time = "";
            if(i < 10) {
                time = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8)
                        + " " + "0" + Integer.toString(i) + ":00:00.0";
            } else {
                time = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8)
                        + " " + Integer.toString(i)  + ":00:00.0";
            }
            Timestamp timestamp = Timestamp.valueOf(time);
            temp.add(timestamp);
        }
        return stampListToPairList(temp);
    }

    private static List<TimePair> stampListToPairList(List<Timestamp> stampList) {
        List<TimePair> result = new ArrayList<TimePair>();
        for(int i=0; i+1<stampList.size(); i++) {
            TimePair tp = new TimePair(stampList.get(i), stampList.get(i+1));
            result.add(tp);
        }
        return result;
    }*/

    public static List<String> timeListToString(List<TimePair> timeList) {
        List<String> result = new ArrayList<String>();
        for(TimePair tp : timeList) {
            String s = tp.getStart().toString().substring(0, 16) + " - " + tp.getEnd().toString().substring(11, 16);
            result.add(s);
        }
        return result;
    }


    public static List<Event> findDailySchedule(Client client) {
        List<Event> events = Event.find.where().eq("involvedEmail", client.getEmail()).findList();
        List<Event> result = new ArrayList<Event>();
        for(Event e : events) {
            if(getDate(e.getStartTime().toString()).equals(currentDate())) {
                result.add(e);
            }
        }
        return result;
    }
    
        public static Event getEventById(Long eventId) {
        return find.byId(eventId);
    }
}