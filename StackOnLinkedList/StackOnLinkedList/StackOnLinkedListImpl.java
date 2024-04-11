package edu.ensign.cs335.structure.stack;

/**
 * Name: Gunmo Kim
 * Class: CS 335
 * Date: 03.13.24
 */

public class StackOnLinkedListImpl<T> implements StackOnLinkedList<T> {
    private int size;//declare size
    private Node<T> top;//declare node, and start from top

    private static class Node<T> {
        T data;//declare data
        Node<T> next;//declare next

        Node(T data) {
            this.data = data; // Initialize node
        }
    }

    public StackOnLinkedListImpl() {
        this.top = null; //Initialize top
        this.size = 0; //Initialize size
    }

    @Override
    public void push(T t) {
        Node<T> newNode = new Node<T>(t);//make a new node
        newNode.next = top;//put top in the newNode's next node
        top = newNode;//make the newNode at top
        size ++;//increase size
    }

    @Override
    public T pop() {
        if (top == null) {
            return null;
        }//if Node is not empty
        T n = top.data;//put the top data to n
        top = top.next;//put the second of top element to top
        size--;//decrease size
        return n;
    }

    @Override
    public T peek() {
        if (top == null) {
            return null;
        }//if Node is not empty
        return top.data;//return top data
    }

    @Override
    public int getSize() {
        return size;//get size
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();//make a new sb
        Node<T> n = top;//start the node from top
        while (n != null) {
            sb.append(n.data);//put the data to the sb
            if (n.next != null) {
                sb.append(" -> ");
            }//put the ->
            n = n.next;
        }
        return sb.toString();//return toString
    }
}
