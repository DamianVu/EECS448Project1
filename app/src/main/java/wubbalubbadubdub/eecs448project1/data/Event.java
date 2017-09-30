package wubbalubbadubdub.eecs448project1.data;


import java.util.List;

/**
 * Event.java
 * @author Damian, Lane
 * @version 1.0
 *
 * Event DataType for keeping track of events
 */
public class Event implements Comparable<Event> {

    private int id;
    private String name;
    private String creator;
    private List<DateSlot> dateSlots;

    /**
     * Constructor for an Event. Events will always be constructed this way.
     * @param inputID int ID of the event
     * @param inputName String name of the Event Title
     * @param inputCreator String name of the Event Creator
     * @param inputDateSlots List of DateSlots that the event is schedulaed for
     */
    public Event(int inputID, String inputName, String inputCreator, List<DateSlot> inputDateSlots) {
        id = inputID;
        name = inputName;
        creator = inputCreator;
        dateSlots = inputDateSlots;
    }

    /**
     * Allows events to be compared to each other.
     * @param otherEvent Event object of event to compare to
     * @return int < 0 if given event is later than current event. int = 0 if given event is same day as current. int > 0 otherwise
     */
    public int compareTo(Event otherEvent) {
        int[] currentDate = HelperMethods.getMonthDayYear(dateSlots.get(0).getDate());
        int[] otherDate = HelperMethods.getMonthDayYear(otherEvent.getDateSlots().get(0).getDate());

        if (currentDate[2] == otherDate[2]) {
            if (currentDate[0] == otherDate[0]) {
                return currentDate[1] - otherDate[1];
            } else {
                return currentDate[0] - otherDate[0];
            }
        } else {
            return currentDate[2] - otherDate[2];
        }
    }

    // We will probably not need setters.

    // Getters

    /**
     * Getter for the Event ID
     * @return int ID
     */
    public int getID() { return id; }

    /**
     * Getter for the Date List
     * @return List<DateSlot> with dates included
     */
    public List<DateSlot> getDateSlots() {
        return dateSlots;
    }

    /**
     * Getter for the Event Name String
     * @return String event name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the Event Creator String
     * @return String event creator
     */
    public String getCreator() {
        return creator;
    }


}