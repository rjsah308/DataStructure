package edu.ensign.cs335.sorting.player;

import java.util.Comparator;

/**
 * Class to hold the player details.
 *
 * NOTE: For this assignment, DO NOT change the code in this class.
 * Changing code in this class and submitting will result in a 5 point loss ont the assignment.
 */
public class SportsPlayer {

    private SportsPlayerName name;
    private String number;

    public SportsPlayer(SportsPlayerName name, String number) {
        this.name = name;
        this.number = number;
    }

    public SportsPlayerName getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return this.name.getFirst() + " " + this.name.getLast() + ": " + this.number;
    }
}
