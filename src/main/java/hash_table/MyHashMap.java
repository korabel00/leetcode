package hash_table;

import java.util.*;

/**
 * Design a HashMap without using any built-in hash table libraries.
 * <p>
 * Implement the MyHashMap class:
 * <p>
 * MyHashMap() initializes the object with an empty map.
 * void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
 * int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
 * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
 * Output
 * [null, null, null, 1, -1, null, 1, null, -1]
 * <p>
 * Explanation
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1); // The map is now [[1,1]]
 * myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
 * myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
 * myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
 * myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
 * myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
 * myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
 * myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= key, value <= 106
 * At most 104 calls will be made to put, get, and remove.
 */

// Time O(MAX_VALUE/BUCKETS_LIST_SIZE)
// Space Complexity: O(BUCKETS_LIST_SIZE+Number of unique keys)
class MyHashMap {

    static class Entry {
        public int key;
        public int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int MAX_VALUE = 1000000;
    // We use big prime number to shorter possible collisions and makes hashing more efficient when use modulo operator (%)
    private static final int BUCKETS_LIST_SIZE = 997;
    LinkedList<Entry>[] bucketList;

    public MyHashMap() {
        bucketList = new LinkedList[BUCKETS_LIST_SIZE];
    }

    public void put(int key, int value) {
        int bucket = key % BUCKETS_LIST_SIZE;
        if (bucketList[bucket] == null) {
            bucketList[bucket] = new LinkedList<>();
            bucketList[bucket].add(new Entry(key, value));
        } else {
            LinkedList<Entry> entries = bucketList[bucket];
            for (Entry entry : entries) {
                if (entry.key == key) {
                    entry.value = value;
                    return;
                }
            }
            entries.add(new Entry(key, value));
        }
    }

    public int get(int key) {
        int bucket = key % BUCKETS_LIST_SIZE;
        LinkedList<Entry> entries = bucketList[bucket];
        if (entries == null) return -1;
        for (Entry entry : entries) {
            if (entry.key == key) return entry.value;
        }
        return -1;
    }

    public void remove(int key) {
        int bucket = key % BUCKETS_LIST_SIZE;
        Entry toRemove = null;
        if (bucketList[bucket] == null) return;
        else {
            LinkedList<Entry> entries = bucketList[bucket];
            for (Entry entry: entries) {
                if (entry.key == key) toRemove = entry;
            }
            if (toRemove == null) return;
            else entries.remove(toRemove);
        }
    }
}
