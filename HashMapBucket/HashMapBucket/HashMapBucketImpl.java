package edu.ensign.cs335.structure.map;

import java.util.HashMap;
import java.util.*;

/**
 * Name: Gunmo Kim
 * Class: CS 335
 * Date: 03.27.24
 */

public class HashMapBucketImpl<K, V> implements HashMapBucket<K, V> {
    //Declare map and bucketCount
    private final Map<Integer, List<V>> map = new HashMap<>();
    private final int bucketCount;

    public HashMapBucketImpl(int size) {//construct Hashmap with the size
        this.bucketCount = size;
    }

    @Override
    public void insertHash(K key, V value) {
        int bucketIndex = key.hashCode() % bucketCount;//calculate the bucketIndex
        map.computeIfAbsent(bucketIndex, k -> new LinkedList<>()).add(value);//add key and values to map
    }

    @Override
    public void showHashMap() {//displays bucket and values
        for (int i = 0; i < bucketCount; i++) {
            System.out.print("Bucket [" + i + "]: ");
            List<V> values = map.get(i);//put the values in the List
            if (values != null) {
                System.out.println(values);
            } else {
                System.out.println("null");
            }
        }
    }

    @Override
    public void deleteHash(K key) {
        int bucketIndex = key.hashCode() % bucketCount;
        map.remove(bucketIndex);//remove the values
    }

    @Override
    public V findHash(K key) {
        int bucketIndex = key.hashCode() % bucketCount;
        List<V> values = map.get(bucketIndex);
        if (values != null && !values.isEmpty()) {
            return values.get(0);
        }
        return null;
    }

    @Override
    public void showHashtable() {
        showHashMap();
    }
}
