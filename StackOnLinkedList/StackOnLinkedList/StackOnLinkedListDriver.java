/*
    Instructor:     Darin Wilcox
    Class:          CS335 Data Structures and Algorithms

    Description:    StackOnLinkedListDriver
*/

package edu.ensign.cs335.structure.stack;

/**
 * Driver class for using the StackOnLinkedList interface and implementation.
 *
 * The assignment is to create a StackOnLinkedListImpl.java file that implements the StackOnLinkedList interface
 * to execute the methods below.
 */
public class StackOnLinkedListDriver
{
    public static void main(String[] args) {
        StackOnLinkedList<Integer> stackLl = new StackOnLinkedListImpl<>();

        System.out.println("Pushing values unto the Stack: ");
        for (int value = 1; value < 11; value++) {
            stackLl.push(value);
            System.out.print(value + ", ");
        }
        System.out.println("\n");
        System.out.println("Stack elements:");
        System.out.println(stackLl);
        System.out.println("Size of stack is: " + stackLl.getSize());

        System.out.println("\nPopping 10 and 9 out of the stack:");
        assert (stackLl.pop() == 10);
        assert (stackLl.pop() == 9);

        System.out.println("Stack elements:");
        System.out.println(stackLl);
        System.out.println("\nTop element of stack is: " + stackLl.peek());
    }
}
