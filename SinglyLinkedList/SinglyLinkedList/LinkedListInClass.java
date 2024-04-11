package edu.ensign.cs335.structure.list;
import java.util.Collections;
import java.util.LinkedList;

/**
 * This is a class that we'll use in-class to practice using the built-in methods from the java.util.LinkedList class.
 *
 * The activity is to fill out the details defined in each "TODO".
 */
public class LinkedListInClass {

    /**
     * The main method and entry point for the application.
     * @param args The command-line arguments passed in during runtime.
     */
    public static void main(String... args) {
        new LinkedListInClass();
    }

    /**
     * Constructor for the main class.
     */
    private LinkedListInClass() {
        // TODO Create an instance of a java.util.LinkedList assigned to the variable stringList.
        LinkedList <String> stringList = new LinkedList<>();
        // TODO Display whether the stringList is empty or not.
        System.out.println(stringList.isEmpty());
        // TODO Add five String instances to the stringList sequentially.
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        // TODO Add five String instances to the stringList at positions 10-14.
        stringList.add("6");
        stringList.add("7");
        stringList.add("8");
        stringList.add("9");
        stringList.add("10");
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        // TODO Display the contents of the stringList.
        System.out.println("Contents of the list: " + stringList);
        // TODO Add the String value "Hello" without specifying a position.
        stringList.add("Hello");
        // TODO Display the index of the value "Hello" and the index of the value "World" (what happens if "World" isn't found?)
        System.out.println("Index of 'Hello': " + stringList.indexOf("Hello"));
        System.out.println("Index of 'World': " + stringList.indexOf("World"));
        // TODO Using a single statement, add the following String values:  "john", "mac", "joe", "mary", "joan", "mckray"
        stringList.add("john");
        stringList.add("mac");
        stringList.add("joe");
        stringList.add("mary");
        stringList.add("joan");
        stringList.add("mckray");
        // TODO Sort the values in the LinkedList in alphabetically ascending order.
        Collections.sort(stringList);
    }
}