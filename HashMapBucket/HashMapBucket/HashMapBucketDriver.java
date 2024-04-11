/*
    Class:          CS335 Data Structures and Algorithms
    Instructor:     Darin Wilcox

    Description:    HashMapBucket Driver

    Visualization:
        https://www.cs.usfca.edu/~galles/visualization/BST.html
        https://visualgo.net/en

*/

package edu.ensign.cs335.structure.map;

public class HashMapBucketDriver
{
    public static void main(String[] args) {
        HashMapBucket<Integer, Integer> hashMapBucket = new HashMapBucketImpl<>(31);
        hashMapBucket.insertHash(44, 44);
        hashMapBucket.insertHash(17, 17);
        hashMapBucket.insertHash(88, 88);
        hashMapBucket.insertHash(8, 8);
        hashMapBucket.insertHash(32, 32);
        hashMapBucket.insertHash(65, 65);
        hashMapBucket.insertHash(97, 97);
        hashMapBucket.insertHash(28, 28);
        hashMapBucket.insertHash(21, 21);
        hashMapBucket.insertHash(29, 29);
        hashMapBucket.insertHash(54, 54);
        hashMapBucket.insertHash(82, 82);
        hashMapBucket.insertHash(76, 76);
        hashMapBucket.insertHash(80, 80);
        hashMapBucket.insertHash(97, 97);
        hashMapBucket.insertHash(93, 93);
        hashMapBucket.insertHash(99, 99);
        hashMapBucket.insertHash(100, 100);

        System.out.println("\nHashMap populated: ");
        hashMapBucket.showHashMap();

        ///
        System.out.println("\nDelete key '97':");
        hashMapBucket.deleteHash(97);

        ///
        System.out.println("\nHash table after deletion of key '97':");
        hashMapBucket.showHashtable();

        ///
        System.out.println("\nFind key '101':");
        System.out.println(hashMapBucket.findHash(101));
        System.out.println("\nFind key '100':");
        System.out.println(hashMapBucket.findHash(100));
    }
}
