package edu.ensign.cs335.structure.map.Practice;

import java.util.HashMap;

/**
 * This is a class that we'll use in-class to practice using the built-in methods from the java.util.HashMap class.
 */
public class HashMapInClass {

    /**
     * The main method and entry point for the application.
     * @param args The command-line arguments passed in during runtime.
     */
    public static void main(String... args) {
        new HashMapInClass();
    }

    /**
     * Constructor for the HashMapInClass class.
     */
    private HashMapInClass() {
        // TODO Create an instance of the java.util.HashMap class and assign it to a stringMap variable.
        // TODO add 10 different objects to the stringMap (you get to decide which key to use)
            HashMap<String,String> map = new HashMap<>(10);
            for(int i = 0; i<10; i++){
                map.put(Integer.toString(i), "Value" + Integer.toString(i));
            }

        // TODO Display only the values from the stringMap.
        for(String value : map.values()){
            System.out.print(value + " ");
        }
        System.out.print("\n");

        // TODO Display only the keys from the stringMap.
        for(String key : map.keySet()){
            System.out.print(key + " ");
        }
        // TODO Calculate the time it takes to find one element from the stringMap and display the time.
        long bTime = System.nanoTime();
        map.get("1");
        long aTime = System.nanoTime();
        long secDiffTime = (aTime - bTime);
        System.out.println("time differences for finding : "+secDiffTime);

        // TODO Calculate the time it takes to remove one element from the stringMap.
        long b2Time = System.nanoTime();
        map.remove("2");
        long a2Time = System.nanoTime();
        long sec2DiffTime = (aTime - bTime);
        System.out.println("time differences for removing : "+sec2DiffTime);
        for(String key : map.keySet()){
            System.out.print(key + " ");
        }

        // TODO Search for an element that does NOT exist in the map.  Calculate the time it takes to look for it and display the time.

        long b3Time = System.nanoTime();
        map.containsKey("11");
        long a3Time = System.nanoTime();
        long sec3DiffTime = (aTime - bTime);
        System.out.println("time differences for search : "+sec3DiffTime);



        // TODO add 5 more unique objects to the stringMap - calculate the time it takes to increase the size and display it.
        map.put("A", "Apple");
        map.put("A", "Banana");
        map.put("A", "Cat");
        map.put("A", "Dog");
        map.put("A", "Emergency");

        long b4Time = System.nanoTime();
        map.containsKey("A");
        long a4Time = System.nanoTime();
        long sec4DiffTime = (aTime - bTime);
        System.out.println("time differences for search : "+sec4DiffTime);

        // TODO Create a second HashMap instance (stringMap2) and copy all values from stringMap to stringMap2.

        // TODO Clear all values from stringMap.

        // TODO What will happen to the values of stringMap2 if all the values from stringMap are cleared?
    }
}