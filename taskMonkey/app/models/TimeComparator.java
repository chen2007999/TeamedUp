package models;

import java.sql.Timestamp;
import java.util.*;

public class TimeComparator implements Comparator<TimePair> {
    @Override
    public int compare(TimePair a, TimePair b) {
        return a.getStart().before(b.getStart()) ? 1 : -1;
    }
}