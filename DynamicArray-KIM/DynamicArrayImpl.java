package edu.ensign.cs335.dynamicarray;

import java.util.stream.IntStream;

public class DynamicArrayImpl<T> implements DynamicArray<T> {

    private T[] array;
    private int size = 0;

    public DynamicArrayImpl(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    /*
    resize Array, if size is going to over array length, it will be 2 times of the formal size.
    if the size is smaller than 2 times of the array length, it will be divide half
     */
    private void resizeArray(boolean increase) {
        if (increase) {
            if (this.size == this.array.length) {
                T[] newArray = (T[]) new Object[this.array.length * 2];
                System.arraycopy(array, 0, newArray, 0, size);
                this.array = newArray;
            }
        } else {
            if (this.getCapacity() > 10) {
                if (this.size <= (this.array.length / 2) && !increase) {
                    T[] newArray = (T[]) new Object[this.array.length / 2];
                    System.arraycopy(array, 0, newArray, 0, size);
                    this.array = newArray;
                }
            }
        }
    }

    //Add element
    @Override
    public void add(T element) {
        resizeArray(true); // Increase size
        this.array[this.size] = element; // put some number in the end of the array
        this.size++; //adding up the size of the array
    }

    //remove element
    @Override
    public T remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(index);
        } // if the index is out of range
        T removeElement = this.array[index]; //save the removed number to removeElement
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }//Shifts any subsequent elements to the left
        this.size--;
        if (this.size <= this.array.length / 2) {
            resizeArray(false); // Decrease size
        }

        return removeElement;
    }
    // if specified index is empty, add number in there, else remove number first and add
    @Override
    public void put(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }//if the index is out of range
        if (array[index] == null) {
            this.array[index] = element; // put the element
        } else {
            T removedElement = remove(index); // remove method
            this.array[index] = element; // put the element
        }
    }
    //Retrieves the element at the specified index
    @Override
    public T get(int index) {
        return this.array[index];
    }
    //Returns the number of elements
    @Override
    public int getSize() {
        return size;
    }
    //Returns the current capacity
    @Override
    public int getCapacity() {
        return this.array.length;
    }
    //Returns true if this DynamicArray empty, else false
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
