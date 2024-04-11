/*
    Name:           Darin Wilcox
    Class:          CS335 Data Structures and Algorithms

    Description:    QueueOnLinkedListDriver
*/

package edu.ensign.cs335.structure.queue;

public class QueueOnLinkedListDriver
{
    public static void main(String[] args) {
        QueueOnLinkedList<Integer> queueLl = new QueueOnLinkedListImpl<>();
        assert queueLl.isEmpty();

        for (int value = 1; value < 11; value++) {
            queueLl.enqueue(value);
        }

        System.out.println("Added to the Queue:");
        System.out.println(queueLl);
        System.out.println("Queue size: " + queueLl.getSize());

        assert (queueLl.getSize()  == 10);
        assert (queueLl.dequeue()   == 1);
        assert (queueLl.peekFront() == 2);
        assert (queueLl.peekRear()  == 10);

        System.out.println("\nAfter queue operations:");
        System.out.println(queueLl);

        queueLl.clear();
        assert queueLl.isEmpty();
        System.out.println("\nCleaned up the Queue:");
        System.out.println("Queue size: " + queueLl.getSize());

        System.out.println(queueLl);
    }
}
