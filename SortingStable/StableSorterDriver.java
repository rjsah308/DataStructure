package edu.ensign.cs335.sorting.stable;

import java.util.Random;

/**
 * Driver class
 *
 * NOTE: This class should not be modified.
 */
public class StableSorterDriver {

    private StableSorter<Integer> stableSorter;

    /**
     * Main entry point for the application.
     * @param args
     */
    public static void main(String... args) {
        new StableSorterDriver();
    }

    /**
     * Private, argumented constructor.
     */
    private StableSorterDriver() {
        this.stableSorter= new StableSorterImpl<>();

        System.out.println("");

        Integer[] intArray1 = this.generateRandomObjects(50);
        System.out.println("Original array for bubble sort:");
        this.displayIntegers(intArray1);
        Integer[] bubbleSortedArray = this.stableSorter.sortBubbleSort(intArray1, StableSorter.SortOrder.DESCENDING);
        System.out.println("Sorted array using bubble sort:");
        this.displayIntegers(bubbleSortedArray);

        System.out.println("");
        Integer[] intArray2 = this.generateRandomObjects(43);
        System.out.println("Original array for selection sort:");
        this.displayIntegers(intArray2);
        Integer[] selectionSortedArray = this.stableSorter.sortSelectionSort(intArray2, StableSorter.SortOrder.ASCENDING);
        System.out.println("Sorted array using selection sort: ");
        this.displayIntegers(selectionSortedArray);

        System.out.println("");
        Integer[] intArray3 = this.generateRandomObjects(43);
        System.out.println("Original array for insertion sort:");
        this.displayIntegers(intArray3);
        Integer[] insertionSortedArray = this.stableSorter.sortInsertionSort(intArray2, StableSorter.SortOrder.ASCENDING);
        System.out.println("Sorted array using insertion sort: ");
        this.displayIntegers(insertionSortedArray);
    }

    /**
     * Generates an array of Integers where the
     * @param size
     * @return
     */
    private Integer[] generateRandomObjects(int size) {

        Integer[] unsortedArray = new Integer[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            unsortedArray[i] = (random.nextInt(200) + 1);
        }

        return unsortedArray;
    }

    /**
     *
     * @param intArray
     */
    private void displayIntegers(Integer[] intArray) {
        for (Integer integer : intArray) {
            System.out.print(integer + ", ");
        }
        System.out.println("");
    }
}