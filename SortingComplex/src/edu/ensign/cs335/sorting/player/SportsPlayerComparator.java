package edu.ensign.cs335.sorting.player;
import java.util.Comparator;

/**
 * Name: Gunmo Kim
 * Class: CS 335
 * Date: 02.26.24
 *
 */

public class SportsPlayerComparator {


    public static class FirstNameComparator implements Comparator<SportsPlayer> {
        @Override
        public int compare(SportsPlayer player1, SportsPlayer player2) {
            // Compare by FirstName
            int firstNameComparison = player1.getName().getFirst().compareTo(player2.getName().getFirst());
            //if first name is not same, return lastNameComparison
            if (firstNameComparison != 0) {
                return firstNameComparison;
            }
            return 0;
        }
    }
    public static class LastNameComparator implements Comparator<SportsPlayer> {
        @Override
        public int compare(SportsPlayer player1, SportsPlayer player2) {
            // Compare by FirstName
            int lastNameComparison = player1.getName().getLast().compareTo(player2.getName().getLast());
            //if last name is not same, return lastNameComparison
            if (lastNameComparison != 0) {
                return lastNameComparison;
            }
            return 0;
        }
    }

    public static class LastNameNumberComparator implements Comparator<SportsPlayer> {
        @Override
        public int compare(SportsPlayer player1, SportsPlayer player2) {
            // Compare by LastName
            int lastNameComparison = player1.getName().getLast().compareTo(player2.getName().getLast());
            //if last name is not same, return lastNameComparison
            if (lastNameComparison != 0) {
                return lastNameComparison;
            }
            //if last name are same, compare numbers
            int number1 = Integer.parseInt(player1.getNumber());
            int number2 = Integer.parseInt(player2.getNumber());
            return Integer.compare(number1, number2);
        }
    }
}

