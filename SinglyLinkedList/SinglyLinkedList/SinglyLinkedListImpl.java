package edu.ensign.cs335.structure.list;

/**
 * Name: Gunmo Kim
 * Class: CS 335
 * Date: 03.11.24
 */

public class SinglyLinkedListImpl<T extends Comparable<T>> implements SinglyLinkedList<T> {
    Node<T> head = null;
    int size = 0;

    @Override
    public void append(T data) {
        Node<T> newNode = new Node<>(data);//make a new node
        if (head == null) {//if head is empty, put the new node in the head
            head = newNode;
        } else {
            Node<T> n = head;//start point for the node
            while (n.getNext() != null) {//until last node
                n = n.getNext();//pass one by one
            }
            n.setNext(newNode);//add new node in the tail
        }
        size++;//add up size
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getCount() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }//if head is empty, return true

    @Override
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);// put the new data to newNode
        if (head == null) {
            head = newNode;//if head = null, put the newNode to head
        }
        Node<T> n = head;//start the node from start
        while (n.getNext() != null) {
            n = n.getNext();
        }//while node is to be end
        n.setNext(newNode);//set end data to the end of node
        size++;
    }

    @Override
    public void insertNth(T data, int index) {
        if (index == 0) {
            insertHead(data);
        }//if put 0, insert data to the head
        Node<T> newNode = new Node<>(data);// put the new data to newNode
        Node<T> n = head;//start the node from start
        int currentIndex = 0;//make a currentIndex for comparing to index
        while (currentIndex < index - 1) {
            n = n.getNext();
            currentIndex++;
        }//move to the end node
        newNode.setNext(n.getNext()); // set the node to next node for the newNode
        n.setNext(newNode); // set the next node for the current node to newNode
        size++;

    }

    @Override
    public void insertHead(T data) {
        Node<T> newNode = new Node<>(data); // make a new node
        newNode.setNext(head); // set the head node as a next of new node
        head = newNode; // update new node is head
        size++;
    }

    @Override
    public boolean search(T data) {
        Node<T> newNode = new Node<>(data);//make a newNode
        Node<T> n = head;//start the node from start
        for (int i = 0; n != null; i++) {//while to the end
            if (newNode.getData().equals(n.getData())) {
                return true;
            }//check one by one if they are equal
            n = n.getNext();// go to next node
        }
        return false;
    }

    @Override
    public T getNth(int index) {
        Node<T> n = head;//start the node from start
        int currentIndex = 0;//make a currentIndex for comparing to index
        while (currentIndex < index) {
            n = n.getNext();
            currentIndex++;
        }//move right before index node
        return n.getData();//get the data for the node
    }

    @Override
    public boolean delete() {
        if (head == null) {
            return false;
        }//if head is null, return false
        if (head.getNext() == null) {
            head = null;
            size--;
            return true;
        }//if head is the only node, delete head
        Node<T> n = head;//start the node from start
        while (n.getNext().getNext() != null) {
            n = n.getNext();
        }//move to before the last node
        n.setNext(null);//set the last before node as null
        size--;
        return true;

    }

    @Override
    public boolean deleteHead() {
        if (head == null) {
            return false;
        }//if head is null, return false
        Node<T> n = head;//start the node from start
        head = (head.getNext());//switch the head node to next node
        size--;
        return true;
    }

    @Override
    public boolean deleteNth(int index) {
        if (head == null) {
            return false;
        }//if head is null, return false
        if (index == 0) {
            head = head.getNext();//switch the head node to next node
            size--;
            return true;
        }
        Node<T> n = head;//start the node from start
        for (int currentIndex = 0; n != null && currentIndex < index - 1; currentIndex++) {
            n = n.getNext();
        }
        // move to before index
        if (n != null && n.getNext() != null) {
            n.setNext(n.getNext().getNext());
            size--;//if index code or the before index code = null, set the node to the next next node
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();//make a new sb
        Node<T> n = head;//start the node from start
        while (n != null) {
            sb.append(n.getData());//put the data to the sb
            if (n.getNext() != null) {
                sb.append(" -> ");
            }//put the ->
            n = n.getNext();
        }
        return sb.toString();
    }

    @Override
    public void clear() {
        head = null;//make head null
        size = 0;//reset size
    }
}