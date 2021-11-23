package hash_table;

import java.util.*;

/**
 * Design a HashSet without using any built-in hash table libraries.
 *
 * Implement MyHashSet class:
 *
 * void add(key) Inserts the value key into the HashSet.
 * bool contains(key) Returns whether the value key exists in the HashSet or not.
 * void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 *
 *
 * Example 1:
 *
 * Input
 * ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
 * [[], [1], [2], [1], [3], [2], [2], [2], [2]]
 * Output
 * [null, null, null, true, false, null, true, null, false]
 *
 * Explanation
 * MyHashSet myHashSet = new MyHashSet();
 * myHashSet.add(1);      // set = [1]
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(1); // return True
 * myHashSet.contains(3); // return False, (not found)
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(2); // return True
 * myHashSet.remove(2);   // set = [1]
 * myHashSet.contains(2); // return False, (already removed)
 *
 *
 * Constraints:
 *
 * 0 <= key <= 106
 * At most 104 calls will be made to add, remove, and contains.
 */

// Time complexity is from O(1) (in case BUCKETS_LIST_SIZE = MAX_VALUE) to O(N) in case BUCKETS_LIST_SIZE = 1,
// For this case O(BUCKETS_LIST_SIZE/MAX_VALUE);
// Space complexity behaves the same
public class MyHashSet {

    private static final int MAX_VALUE = 1000000;
    // We use big prime number to shorter possible collisions and makes hashing more efficient when use modulo operator (%)
    private static final int BUCKETS_LIST_SIZE = 997;
    private List<List<Integer>> bucketsList;

    public MyHashSet() {
        bucketsList = new ArrayList<>(BUCKETS_LIST_SIZE);
        for (int i = 0; i < BUCKETS_LIST_SIZE; i++) {
            bucketsList.add(null);
        }
    }

    public void add(int key) {
       int index = key % BUCKETS_LIST_SIZE;
       if (bucketsList.get(index) == null) {
           List<Integer> list = new LinkedList<>();
           list.add(key);
           bucketsList.set(index, list);
       } else {
           if (!bucketsList.get(index).contains(key)) {
               bucketsList.get(index).add(key);
           }
       }
    }

    public void remove(int key) {
        int index = key % BUCKETS_LIST_SIZE;
        if (bucketsList.get(index) != null && bucketsList.get(index).contains(key)) {
            bucketsList.get(index).remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = key % BUCKETS_LIST_SIZE;
        return bucketsList.get(index) != null && bucketsList.get(index).contains(key);
    }
}
