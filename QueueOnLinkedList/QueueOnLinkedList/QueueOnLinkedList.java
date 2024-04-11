package edu.ensign.cs335.structure.queue;
/**
 * The interface for defining a QueueOnLinkedList implementation.
 * @param <T>
 */
public interface QueueOnLinkedList<T> {


    /**
     * Checks if the queue is empty.
     * @return True if empty, else fasle
     */
    boolean isEmpty();

    /**
     * Returns the number of objects in the queue
     * @return The count of objects <T> in the queue
     */
    int getSize();

    /**
     * Removes all elements from the queue.
     */
    void clear();

    /**
     * Adds an object (T) at the beginning of the queue.
     * @param t The object to add to the queue.
     */
    void enqueue(T t);

    /**
     * Removes the element at the head of the queue (FIFO) and removes it from the queue.
     * @return The object T at the head position.  If the queue is empty, it returns null.
     */
    T dequeue();

    /**
     * Returns the element at the head of the queue (FIFO) but does not remove it from the queue.
     * @return The object T at the head position.  If the queue is empty, it returns null.
     */
    T peekFront();

    /**
     * Returns the elements from the tail of the queue, but does not remove it from the queue.
     * @return The object T at the tail position.  If the queue is empty, it returns null.
     */
    T peekRear();
}