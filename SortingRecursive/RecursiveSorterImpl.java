package edu.ensign.cs335.sorting.recursive;

/**
 * Name: Gunmo Kim
 * Class: CS 335
 * Date: 02.19.24
 *
 * @param <T>
 */
public class RecursiveSorterImpl<T extends Comparable<T>> implements RecursiveSorter<T> {

    @Override
    public T[] sortMergeSort(T[] unsortedArray, SortOrder sortOrder) {
        // call merge sort
        mergeSort(unsortedArray, 0, unsortedArray.length - 1, sortOrder);
        return unsortedArray;
    }

    private void mergeSort(T[] unsortedArray, int start, int end, SortOrder sortOrder) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(unsortedArray, start, mid, sortOrder);//devided index from start to mid, recursion
            mergeSort(unsortedArray, mid + 1, end, sortOrder);//devide index from mid to end, recursion
            merge(unsortedArray, start, mid, end, sortOrder);//merge devide elements, recursion
        }
    }

    private void merge(T[] unsortedArray, int start, int mid, int end, SortOrder sortOrder) {
        // Caculate size for the left and right size
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        // declare the tmp arr
        T[] leftArray;
        leftArray = (T[]) new Comparable[leftSize];
        T[] rightArray;
        rightArray = (T[]) new Comparable[rightSize];

        // copy the element to the tmp arr
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = unsortedArray[start + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = unsortedArray[mid + 1 + j];
        }

        // Process of the merge
        int i = 0;
        int j = 0;
        int k = start;
        while (i < leftSize && j < rightSize) {
            if (sortOrder == SortOrder.ASCENDING) {
                if (leftArray[i].compareTo(rightArray[j]) <= 0) {//compare each element if left E is smaller than right E
                    unsortedArray[k++] = leftArray[i++];//put the small number
                } else {
                    unsortedArray[k++] = rightArray[j++];//put the large number
                }
            } else {
                if (leftArray[i].compareTo(rightArray[j]) >= 0) {
                    unsortedArray[k++] = leftArray[i++];
                } else {
                    unsortedArray[k++] = rightArray[j++];
                }
            }
        }

        //Copy the rest of element to unsorted arr
        while (i < leftSize) {
            unsortedArray[k++] = leftArray[i++];
        }
        while (j < rightSize) {
            unsortedArray[k++] = rightArray[j++];
        }
    }


    @Override
    public T[] sortQuickSort(T[] unsortedArray, SortOrder sortOrder) {
        quickSort(unsortedArray, 0, unsortedArray.length - 1, sortOrder);//call the quickSort, recursion
        return unsortedArray;
    }

    public void quickSort(T[] unsortedArray, int start, int end, SortOrder sortOrder) {
        int partR = partition(unsortedArray, start, end, sortOrder);//declare right part
        if (start < partR - 1) {//from start to partR
            quickSort(unsortedArray, start, partR - 1, sortOrder);
        }
        if (partR < end) {//from partR to end
            quickSort(unsortedArray, partR, end, sortOrder);
        }
    }

    private int partition(T[] unsortedArray, int start, int end, SortOrder sortOrder) {
        T pivot = unsortedArray[(start + end) / 2];//declare pivot in the middle number
        while (start <= end) {//while left index not go over to end index
            if (sortOrder == SortOrder.ASCENDING) {
                while (unsortedArray[start].compareTo(pivot) < 0) {//while start E less than pivot E
                    start++;//start move to next index
                }
                while (unsortedArray[end].compareTo(pivot) > 0) {//while end E greater than pivot E
                    end--;//end move to pervious index
                }
            } else {//for Dscending, opposite way
                while (unsortedArray[start].compareTo(pivot) > 0) {
                    start++;
                }
                while (unsortedArray[end].compareTo(pivot) < 0) {
                    end--;
                }
            }
            if (start <= end) {//recheck the start is not over end index
                swap(unsortedArray, start, end);//swap the number
                start++;//start move to next index
                end--;//end move to previous index
            }
        }
        return start;
    }

    //swap method
    private void swap(T[] unsortedArray, int start, int end) {
        T tmp = unsortedArray[start];
        unsortedArray[start] = unsortedArray[end];
        unsortedArray[end] = tmp;
    }

    @Override
    public T[] sortShellSort(T[] unsortedArray, SortOrder sortOrder) {
        for (int gap = unsortedArray.length / 2; gap > 0; gap /= 2) {//make a gap that gradually reduce for compare the numbers between numbers
            for (int i = gap; i < unsortedArray.length; i++) {//start compare
                T key = unsortedArray[i];//hold the element in the key
                int j = i;//hold the index number in the j
                if (sortOrder == SortOrder.ASCENDING) {//For Ascending
                    while (j >= gap && unsortedArray[j - gap].compareTo(key) > 0) {//compare the number gap and gap-j
                        unsortedArray[j] = unsortedArray[j - gap];
                        j = j - gap;
                    }
                    unsortedArray[j] = key;//swap the number
                }else{
                    while (j >= gap && unsortedArray[j - gap].compareTo(key) < 0) {
                        unsortedArray[j] = unsortedArray[j - gap];
                        j = j - gap;
                    }
                    unsortedArray[j] = key;
                }
            }
        }
        return unsortedArray;
    }
}