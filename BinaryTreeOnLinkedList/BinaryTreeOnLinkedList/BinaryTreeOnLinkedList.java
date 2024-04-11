package edu.ensign.cs335.structure.tree;

/**
 * Generic interface declaring methods to interact with a Binary Tree implementation.
 * @param <T> The type of object to use.
 *
 * NOTE: There shouldn't be any reason to modify this interface.
 */
public interface BinaryTreeOnLinkedList<T extends Comparable<T>> {

    /**
     * Adds the element to the Binary Tree.
     * @param t The element to add to the tree.
     */
    void put(T t);

    /**
     * Reads the root node of the tree.
     * @return The node <T> at the root position.  If nothing exists, then it returns null.
     */
    BinaryTreeNode<T> getRoot();

    /**
     * Removes the node containing the values (t).
     * @param t The value of the node to remove.
     * @return True if element is removed, else false.
     */
    boolean remove(T t);

    /**
     * Locates the node containing the value and returns it, but does not remove it.  Will only return the first
     * node found contaiing the value.
     * @param t The value of the node sought.
     * @return The BinaryTreeNode containing the value.
     */
    BinaryTreeNode<T> find(T t);

    /**
     * Displays the tree values using pre-order traversal.
     * @param binaryTreeNode The root node used to traverse the tree.
     */
    void preOrder(BinaryTreeNode<T> binaryTreeNode);

    /**
     * Displays the tree values using in-order traversal.
     * @param binaryTreeNode The root node used to traverse the tree.
     */
    void inOrder(BinaryTreeNode<T> binaryTreeNode);

    /**
     * Displays the tree values using post-order traversal.
     * @param binaryTreeNode The root node used to traverse the tree.
     */
    void postOrder(BinaryTreeNode<T> binaryTreeNode);

    /**
     * Displays the tree in a formal, nice output.
     * @param root The root node used to traverse the tree.
     */
    void displayBinaryTree(BinaryTreeNode<T> root);
}