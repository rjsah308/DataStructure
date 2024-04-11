package edu.ensign.cs335.sorting.stable;


/**
 * Name: Gunmo Kim
 * Class: CS 335
 * Date: 02.02.2024
 *
 * @param <T>
 */
public class StableSorterImpl<T> implements StableSorter<T> {
    @Override
    public T[] sortInsertionSort(T[] unsortedArray, SortOrder sortOrder) {
        for (int i = 1; i < unsortedArray.length; i++) {//start i for loop
            T temp = unsortedArray[i];//hold the i element to temp
            int j;//declare j
            if (sortOrder == SortOrder.ASCENDING) {
                for (j = i - 1; (j >= 0 && ((Comparable<T>) unsortedArray[j]).compareTo(temp) > 0); j--) {//compare j and temp, if j>temp, true
                    unsortedArray[j + 1] = unsortedArray[j];//put j element to j+1
                }//end j for loop
                unsortedArray[j + 1] = temp;//put temp element to j+1
            } else {
                for (j = i - 1; (j >= 0 && ((Comparable<T>) unsortedArray[j]).compareTo(temp) < 0); j--) {//compare j and temp, if j<temp, true
                    unsortedArray[j + 1] = unsortedArray[j];//put j element to j+1
                }//end j for loop
                unsortedArray[j + 1] = temp;//put temp element to j+1
            }
        }//end i for loop
        // TODO Implement this method by directly implementing the Insertion Sort
        return unsortedArray;
    }

    @Override
    public T[] sortSelectionSort(T[] unsortedArray, SortOrder sortOrder) {
        for (int i = 0; i < unsortedArray.length; i++) {//start i for loop
            int minIndex = i;//set the i to minimum index
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (sortOrder == SortOrder.ASCENDING) {
                    if (((Comparable<T>) unsortedArray[minIndex]).compareTo(unsortedArray[j]) > 0) {//compare minimum index element to j, if minimum element > j, true
                        minIndex = j;//set the j to minimum element.
                    }//end if
                } else {
                    if (((Comparable<T>) unsortedArray[minIndex]).compareTo(unsortedArray[j]) < 0) {//compare minimum index element to j, if minimum element < j, true
                        minIndex = j;//set the j to minimum element.
                    }//end if
                }
                T temp = unsortedArray[i];//Hold index i element to temp
                unsortedArray[i] = unsortedArray[minIndex];//put the minIndex element to i
                unsortedArray[minIndex] = temp;//put the temp element to minIndex
            }
        }//end i for loop
        // TODO Implement this method by directly implementing the Selection Sort
        return unsortedArray;
    }

    @Override
    public T[] sortBubbleSort(T[] unsortedArray, SortOrder sortOrder) {
        for (int i = 0; i < unsortedArray.length; i++) {//start i for loop for reducing array size for j for loop
            for (int j = 0; j < unsortedArray.length - i - 1; j++) {//start j for loop
                if (sortOrder == SortOrder.DESCENDING) {
                    if (((Comparable<T>) unsortedArray[j + 1]).compareTo(unsortedArray[j]) > 0) {//compare j+1 and j, if j+1 > j, true
                        T temp = unsortedArray[j]; //Hold index j element to temp
                        unsortedArray[j] = unsortedArray[j + 1];//put the j+1 element to j
                        unsortedArray[j + 1] = temp;//put temp element to j+1
                    }//end if
                } else {
                    if (((Comparable<T>) unsortedArray[j + 1]).compareTo(unsortedArray[j]) < 0) {
                        T temp = unsortedArray[j]; //Hold index j element to temp
                        unsortedArray[j] = unsortedArray[j + 1];//put the j+1 element to j
                        unsortedArray[j + 1] = temp;//put temp element to j+1
                    }

                }
            }//end j for loop
        }//end i for loop
        return unsortedArray;

        // TODO Implement this method by directly implementing the Bubble Sort

    }
}