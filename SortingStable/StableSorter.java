package edu.ensign.cs335.sorting.stable;

/**
 * CS 335: Data Structures and Algorithms
 * Sorting Stable Assignment
 * @param <T>
 */
public interface StableSorter<T> {

    enum SortOrder{
        ASCENDING,
        DESCENDING
    }

    /**
     * Sorts the unsorted array of type T using the insertion sort.
     * @param unsortedArray The array of type T to sort.
     * @param sortOrder Defines whether the order is sorted in ascending or descending order.
     * @return A sorted array of type T, based on the sort order.
     */
    T[] sortInsertionSort(T[] unsortedArray, SortOrder sortOrder);

    /**
     * Sorts the unsorted array of type T using the selection sort.
     * @param unsortedArray The array of type T to sort.
     * @param sortOrder Defines whether the order is sorted in ascending or descending order.
     * @return A sorted array of type T, based on the sort order.
     */
    T[] sortSelectionSort(T[] unsortedArray, SortOrder sortOrder);

    /**
     * Sorts the unsorted array of type T using the bubble sort.
     * @param unsortedArray The array of type T to sort.
     * @param sortOrder Defines whether the order is sorted in ascending or descending order.
     * @return A sorted array of type T, based on the sort order.
     */
    T[] sortBubbleSort(T[] unsortedArray, SortOrder sortOrder);
}