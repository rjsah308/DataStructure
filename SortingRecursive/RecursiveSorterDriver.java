package edu.ensign.cs335.sorting.recursive;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Driver class
 *
 * NOTE: This class should not be modified.
 */
public class RecursiveSorterDriver {

    private RecursiveSorter<Double> recursiveSorter;

    /**
     * Main entry point for the application.
     * @param args
     */
    public static void main(String... args) {
        new RecursiveSorterDriver();
    }

    /**
     * Private constructor.
     */
    private RecursiveSorterDriver() {
        this.recursiveSorter = new RecursiveSorterImpl<>();

        Double[] dubArray1 = this.generateRandomDoubles(23);
        System.out.println("Original double array for merge sort: ");
        this.displayDoubles(dubArray1);
        Double[] mergeSortedArray = this.recursiveSorter.sortMergeSort(dubArray1, RecursiveSorter.SortOrder.DESCENDING);
        System.out.println("Sorted array using merge sort: ");
        this.displayDoubles(mergeSortedArray);

        System.out.println("");
        Double[] dubArray2 = this.generateRandomDoubles(27);
        System.out.println("Original double array for quick sort: ");
        this.displayDoubles(dubArray2);
        Double[] quickSortedArray = this.recursiveSorter.sortQuickSort(dubArray2, RecursiveSorter.SortOrder.DESCENDING);
        System.out.println("Sorted array using quick sort: ");
        this.displayDoubles(quickSortedArray);

        System.out.println("");
        Double[] dubArray3 = this.generateRandomDoubles(21);
        System.out.println("Original double array for shell sort: ");
        this.displayDoubles(dubArray3);
        Double[] shellSortedArray = this.recursiveSorter.sortShellSort(dubArray3, RecursiveSorter.SortOrder.ASCENDING);
        System.out.println("Sorted array using shell sort: ");
        this.displayDoubles(shellSortedArray);
    }

    private Double[] generateRandomDoubles(int size) {
        Double[] unsortedArray = new Double[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            unsortedArray[i] = (random.nextDouble(500) + 1.0d);
        }

        return unsortedArray;
    }

    private void displayDoubles(Double[] doubleArray) {

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        for (Double dub : doubleArray) {
            String formattedDouble = decimalFormat.format(dub);
            System.out.print(formattedDouble + ", ");
        }
        System.out.println("");
    }
}