package models;

import java.sql.Timestamp;
import java.util.*;

public class TimeComparator implements Comparator<TimePair> {
    @Override
    public int compare(TimePair a, TimePair b) {
        return a.getStart().after(b.getStart()) || a.getStart().equals(b.getStart()) ? 1 : -1;
    }
}