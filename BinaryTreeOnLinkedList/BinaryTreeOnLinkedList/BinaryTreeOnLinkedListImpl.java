package edu.ensign.cs335.structure.tree;

/**
 * Name: Gunmo Kim
 * Class: CS 335
 * Date: 04.09.24
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides the methods for binary tree operations putting insertion, removing, and orders,
 * @param <T> The type of object to use.
 */
public class BinaryTreeOnLinkedListImpl<T extends Comparable<T>> implements BinaryTreeOnLinkedList<T> {
    private BinaryTreeNode<T> root = null;

    @Override
    /**
     * Inserts a new node with the given value into the binary tree.
     * Utilizes a recursive method
     *
     * @param t The element to add to the tree.
     */
    public void put(T t) {
        root = putRecursive(root, t);
    }
    /**
     * Recursive method.
     *
     * @param root The starting node.
     * @param t The value.
     * @return The current node.
     */
    private BinaryTreeNode<T> putRecursive(BinaryTreeNode<T> root, T t) {
        if (root == null) {
            root = new BinaryTreeNode<>(t);
            return root;
        }
        if (t.compareTo(root.getData()) < 0) {
            root.setLeft(putRecursive(root.getLeft(), t));
        } else {
            root.setRight(putRecursive(root.getRight(), t));
        }
        return root;
    }
    /**
     * get the root which is the node for tree.
     *
     * @return The root node of the binary tree.
     */
    @Override
    public BinaryTreeNode<T> getRoot() {
        return root;
    }
    /**
     * Removes a node with the specified value.
     * Uses a recursive method to find and remove the node.
     *
     * @param t The value of the node to remove.
     * @return {@code true} if the node was found and removed, {@code false} otherwise.
     */
    @Override
    public boolean remove(T t) {
        root = removeRecursive(root, t);
        return true;
    }
    /**
     * Recursive method to remove a node from the binary tree.
     *
     * @param root The current node in the recursion.
     * @param t The value to remove.
     * @return The current node.
     */
    private BinaryTreeNode<T> removeRecursive(BinaryTreeNode<T> root, T t) {
        if (root == null) {
            return root;
        }
        if (t.compareTo(root.getData()) < 0) {
            root.setLeft(removeRecursive(root.getLeft(), t));
        } else if (t.compareTo(root.getData()) > 0) {
            root.setRight(removeRecursive(root.getRight(), t));
        } else {
            if (root.getLeft() == null && root.getRight() == null) {
                return null;
            } else if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            } else {
                T minData = findMin(root.getRight());
                root.setData(minData);
                root.setRight(removeRecursive(root.getRight(), minData));
            }
        }
        return root;
    }

    /**
     *
     * @param root the current node in the findMin
     * @return min number of the left subtree.
     */
    private T findMin(BinaryTreeNode<T> root) {
        T min = root.getData();
        while (root.getLeft() != null) {
            root = root.getLeft();
            min = root.getData();
        }
        return min;
    }
    /**
     * Finds a node with the specified value in the binary tree.
     * Uses a recursive method.
     *
     * @param t The value of the node to find.
     * @return The node containing the specified value, or {@code null} if not found.
     */
    @Override
    public BinaryTreeNode<T> find(T t) {
        return findRecursive(root, t);
    }

    private BinaryTreeNode<T> findRecursive(BinaryTreeNode<T> root, T t) {
        if (root == null) {
            return null;
        }
        if (t.compareTo(root.getData()) == 0) {
            return root;
        } else if (t.compareTo(root.getData()) < 0) {
            return findRecursive(root.getLeft(), t);
        } else {
            return findRecursive(root.getRight(), t);
        }
    }

    /** find the value with the order of  root > left > right
     *
     * @param binaryTreeNode The root node used to traverse the tree.
     */
    @Override
    public void preOrder(BinaryTreeNode<T> binaryTreeNode) {
        if (binaryTreeNode != null) {
            System.out.print(binaryTreeNode.getData() + " ");
            preOrder(binaryTreeNode.getLeft());
            preOrder(binaryTreeNode.getRight());
        }
    }
    /** find the value with the order of  left > root > right
     *
     * @param binaryTreeNode The root node used to traverse the tree.
     */
    @Override
    public void inOrder(BinaryTreeNode<T> binaryTreeNode) {
        if (binaryTreeNode != null) {
            inOrder(binaryTreeNode.getLeft());
            System.out.print(binaryTreeNode.getData() + " ");
            inOrder(binaryTreeNode.getRight());
        }
    }
    /** find the value with the order of  left > right > root
     *
     * @param binaryTreeNode The root node used to traverse the tree.
     */
    @Override
    public void postOrder(BinaryTreeNode<T> binaryTreeNode) {
        if (binaryTreeNode != null) {
            postOrder(binaryTreeNode.getLeft());
            postOrder(binaryTreeNode.getRight());
            System.out.print(binaryTreeNode.getData() + " ");
        }
    }

    @Override
    public void displayBinaryTree(BinaryTreeNode<T> root) {
        List<List<String>> lines = new ArrayList<List<String>>();

        List<BinaryTreeNode<T>> level = new ArrayList<BinaryTreeNode<T>>();
        List<BinaryTreeNode<T>> next = new ArrayList<BinaryTreeNode<T>>();

        level.add(root);
        int nn = 1;

        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<String>();

            nn = 0;

            for (BinaryTreeNode<T> n : level) {
                if (n == null) {
                    line.add(null);

                    next.add(null);
                    next.add(null);
                } else {
                    String aa = n.getData().toString();
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.getLeft());
                    next.add(n.getRight());

                    if (n.getLeft() != null) nn++;
                    if (n.getRight() != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<BinaryTreeNode<T>> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {

                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '┴' : '┘';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '└';
                        }
                    }
                    System.out.print(c);

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {

                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "─");
                        }
                        System.out.print(j % 2 == 0 ? "┌" : "┐");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "─" : " ");
                        }
                    }
                }
                System.out.println();
            }

            // print line of numbers
            for (int j = 0; j < line.size(); j++) {

                String f = line.get(j);
                if (f == null) f = "";
                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

                // a number
                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            perpiece /= 2;
        }
    }
}
