package edu.ensign.cs335.sorting.player;

/**
 *
 * Class to hold player name components.
 *
 * NOTE: For this assignment, DO NOT change the code in this class.
 * Changing code in this class and submitting will result in a 5 point loss ont the assignment.
 */
public class SportsPlayerName {

    private String first;
    private String last;
    private String middle;

    public SportsPlayerName(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }
}