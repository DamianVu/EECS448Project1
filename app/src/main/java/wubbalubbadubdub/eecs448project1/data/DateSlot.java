package wubbalubbadubdub.eecs448project1.data;

import java.util.List;

/**
 * Created by simonyang on 2017/9/29.
 */

public class DateSlot {
    private String timeslots;
    private String date;

    public DateSlot(String inputTimeslots, String inputDate){
        this.timeslots = inputTimeslots;
        this.date = inputDate;
    }

    public String getDate() {
        return date;
    }

    public String getTimeslots() {
        return timeslots;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTimeslots(String timeslots) {
        this.timeslots = timeslots;
    }
}
