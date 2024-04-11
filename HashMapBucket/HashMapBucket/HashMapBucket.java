package edu.ensign.cs335.structure.map;

public interface HashMapBucket<K, V> {

    /**
     * Inserts the value at the index calculated by using the Key
     * @param key The object representing the key.
     * @param value The object representing the value to store.
     */
    void insertHash(K key, V value);

    /**
     * Displays the contents of the HashMapBucket based on the outline shown in the assignment.
     */
    void showHashMap();

    /**
     * Completely deletes the "bucket" found at the index calculated by the key.  If nothing found at the calculated index,
     * nothing will happen.
     * @param k The key used to find the index of the element to delete.
     */
    void deleteHash(K k);

    /**
     * Locates the hash based on the Key value and returns it.  If hash cannot be found, then returns null.
     * @param k The key used to find the index of the element to return
     * @return The value found at the key
     */
    V findHash(K k);

    /**
     * Displays the
     */
    void showHashtable();
}