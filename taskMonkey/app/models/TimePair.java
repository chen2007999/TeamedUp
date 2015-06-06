package models;

import com.avaje.ebean.bean.EntityBeanIntercept;
import play.db.ebean.Model;

import java.awt.*;
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
        if(a.getStart().before(b.getStart()) && a.getEnd().before(b.getEnd())) {
            return true;
        }
        return false;
    }

    public static boolean contains(TimePair a, TimePair b) {
        if(a.getEnd().before(b.getStart()) && a.getEnd().after(b.getEnd())) {
            return true;
        }
        if(a.getStart().equals(b.getStart()) && a.getEnd().equals(b.getEnd())) {
            return true;
        }
        return false;
    }


}