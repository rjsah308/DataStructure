package edu.ensign.cs335.structure.queue;
import java.util.LinkedList;
/**
 * Name: Gunmo Kim
 * Class: CS 335
 * Date: 03.17.24
 */

public class QueueOnLinkedListImpl<T> implements QueueOnLinkedList<T> {

    LinkedList<T> Q = new LinkedList<>();//Make a LinkedList Q
    @Override
    public boolean isEmpty() {
        return Q.isEmpty(); //return true if Q is empty
    }

    @Override
    public int getSize() {
        return Q.size();//get Q size
    }

    @Override
    public void clear() {
        Q.clear();//clear Q
    }

    @Override
    public void enqueue(T t) {
        Q.addLast(t);//put the element to the beginning of the Q
    }

    @Override
    public T dequeue() {
        if (!isEmpty()) {
            return Q.removeFirst();
        }//if Q is not empty, return first element and remove it.
        return null;
    }

    @Override
    public T peekFront() {
        if (!isEmpty()) {
            return Q.getFirst();
        }//if Q is not empty, return first element
        return null;
    }

    @Override
    public T peekRear() {
        if (!isEmpty()) {
            return Q.getLast();
        }//if Q is not empty, return last element
        return null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");//declare sb toString
        for(T element : Q){ //for each loop start for Q
            if (sb.length() > 1) {//after the second element
                sb.append(", ");//put ,
            }
            sb.append(element);//put the element in the sb
        }
        sb.append("]");//close
        return sb.toString();//return sb toString
    }
}
