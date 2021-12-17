package hash_table;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

// Time = O(N) - for building map + O(N) for adding to heap + O(K) for an array
// Space = O(N) for map + O(N) for heap + O(K) for an array
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer: nums) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        System.out.println(map);

        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> map.get(n2) - map.get(n1));

        for (Integer integer: map.keySet()) {
            heap.add(integer);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = heap.remove();
        }

        return result;
    }
}
