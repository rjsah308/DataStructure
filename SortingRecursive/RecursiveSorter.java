package edu.ensign.cs335.sorting.recursive;

public interface RecursiveSorter<T> {

    enum SortOrder {
        ASCENDING,
        DESCENDING
    }

    /**
     * Sorts the unsorted array of type T using the merge sort.
     * @param unsortedArray The array of type T to sort.
     * @param sortOrder Defines whether the order is sorted in ascending or descending order.
     * @return A sorted array of type T, based on the sort order.
     */
    T[] sortMergeSort(T[] unsortedArray, SortOrder sortOrder);

    /**
     * Sorts the unsorted array of type T using the quick sort.
     * @param unsortedArray The array of type T to sort.
     * @param sortOrder Defines whether the order is sorted in ascending or descending order.
     * @return A sorted array of type T, based on the sort order.
     */
    T[] sortQuickSort(T[] unsortedArray, SortOrder sortOrder);

    /**
     * Sorts the unsorted array of type T using the shell sort.
     * @param unsortedArray The array of type T to sort.
     * @param sortOrder Defines whether the order is sorted in ascending or descending order.
     * @return A sorted array of type T, based on the sort order.
     */
    T[] sortShellSort(T[] unsortedArray, SortOrder sortOrder);
}
