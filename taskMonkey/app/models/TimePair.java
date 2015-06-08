package models;

import com.avaje.ebean.bean.EntityBeanIntercept;
import play.db.ebean.Model;

import java.awt.*;
import java.lang.Integer;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.*;

public class TimePair{

    public final Timestamp start;
    public final Timestamp end;

    public TimePair(Timestamp start, Timestamp end) {
        this.start = start;
        this.end = end;
    }

    public Timestamp getStart() {
        return start;
    }

    public Timestamp getEnd() {
        return end;
    }

    public static boolean overlapsNotContains(TimePair a, TimePair b) {
        if(a.getStart().before(b.getStart()) && a.getEnd().after(b.getStart())) {
            return true;
        }
        if(a.getStart().before(b.getStart()) && a.getEnd().equals(b.getStart())) {
            return true;
        }
        return false;
    }

    public static TimePair containsResult(TimePair a, TimePair b) {
        if(leftContainsRight(a, b)) return a;
        if(leftContainsRight(b, a)) return b;
        return null;
    }

    public static boolean contains(TimePair a, TimePair b) {
        return leftContainsRight(a, b) || leftContainsRight(b, a);
    }

    public static boolean leftContainsRight(TimePair a, TimePair b) {
        if(a.getStart().before(b.getStart())) {
            if(a.getEnd().after(b.getEnd()) || a.getEnd().equals(b.getEnd())) {
                return true;
            }
        }
        if(a.getStart().equals(b.getStart()) && a.getEnd().equals(b.getEnd())) {
            return true;
        }
        return false;
    }

    public static boolean sameDay(TimePair a, TimePair b) {
        return a.getStart().toString().substring(0, 10).equals(b.getStart().toString().substring(0, 10));
    }

    public static int startHour(TimePair a) {
        return Integer.parseInt(a.getStart().toString().substring(11, 13));
    }

    public static int endHour(TimePair a) {
        return Integer.parseInt(a.getEnd().toString().substring(11, 13));
    }

    public static int interval(TimePair a) {
        return endHour(a) - startHour(a);
    }
    //2012-11-11 09:00:00.0 - 2012-11-11 09:00:00.0

    public static TimePair increment(TimePair a) {
        String start = a.getStart().toString();

        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(startHour(a)+1);
        String strI = sb.toString();

        String newStart = start.substring(0, 11) + strI + ":00:00.0";

        StringBuilder sbb = new StringBuilder();
        sbb.append("");
        sbb.append(endHour(a)+1);
        String strII = sbb.toString();

        String newEnd = start.substring(0, 11) + strII + ":00:00.0";

        TimePair result = new TimePair(Timestamp.valueOf(newStart), Timestamp.valueOf(newEnd));
        return result;
    }

    public static TimePair firstHourInTheSlot(TimePair a) {
        String start = a.getStart().toString();
        StringBuilder sbb = new StringBuilder();
        sbb.append("");
        sbb.append(startHour(a)+1);
        String strII = sbb.toString();
        String newEnd = start.substring(0, 11) + strII + ":00:00.0";
        TimePair result = new TimePair(a.getStart(), Timestamp.valueOf(newEnd));
        return result;
    }

    public static boolean tpNotOutDated(TimePair a) {
        Timestamp cur = Event.currentTime();
        return a.getStart().after(cur) && a.getEnd().after(cur);
    }


}