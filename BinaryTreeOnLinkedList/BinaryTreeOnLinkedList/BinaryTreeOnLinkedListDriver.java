/**
 * Course:          CS335 Data Structures and Algorithms
 * Instructor:      Darin Wilcox
 *
 * Description:     BinaryTreeOnLinkedListDriver the driver class to test out the implmentation.
 *
 * Visualization:
 *          https://www.cs.usfca.edu/~galles/visualization/BST.html
 *          https://visualgo.net/en
 *
 * NOTE: Please do NOT modify this class.
 */

package edu.ensign.cs335.structure.tree;

public class BinaryTreeOnLinkedListDriver
{
    public static void main(String[] args)
    {
        BinaryTreeOnLinkedList<Integer> binaryTree = new BinaryTreeOnLinkedListImpl<>();

        binaryTree.put(44);
        binaryTree.put(17);
        binaryTree.put(88);
        binaryTree.put(8);
        binaryTree.put(32);
        binaryTree.put(65);
        binaryTree.put(97);
        binaryTree.put(28);
        binaryTree.put(21);
        binaryTree.put(29);
        binaryTree.put(54);
        binaryTree.put(82);
        binaryTree.put(76);
        binaryTree.put(80);
        binaryTree.put(97);
        binaryTree.put(93);
        binaryTree.put(93);
        binaryTree.put(99);

        {
            var root = binaryTree.getRoot();
            System.out.println("The root number is: " + root.getData());
            assert (root.getData().equals(44));


//            assert (binaryTree.find(100) == null);

//            assert (binaryTree.find(99).getData().equals(99));
            assert (binaryTree.remove(99));
        }

        /// Pre order traversal
        System.out.println("Pre-order traversal:");
        binaryTree.preOrder(binaryTree.getRoot());
        System.out.println("\n");

        /// In order traversal
        System.out.println("In-order traversal:");
        binaryTree.inOrder(binaryTree.getRoot());
        System.out.println("\n");


        /// Post order traversal
        System.out.println("Post-order traversal:");
        binaryTree.postOrder(binaryTree.getRoot());
        System.out.println("\n");

        /// Print Tree nicely
        System.out.println("Print the Tree (Pre-order mode):");
        binaryTree.displayBinaryTree(binaryTree.getRoot());
    }
}

