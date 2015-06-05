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



}