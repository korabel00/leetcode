package hash_table;

import java.util.*;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */

public class SingleNumber {

    // Time = O(NxN) - we use contains() which is O(N) within for loop which is O(N), therefore it is multiplied
    // Space = O(N)
    public int singleNumber(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (Integer integer : nums) {
            // It will remove an integer if it was added before
            // In case of a single appearance it won't be removed only added
            if (list.contains(integer)) {
                list.remove(integer);
                continue;
            }
            list.add(integer);
        }
        return list.get(0);
    }

    // Time = O(N)
    // Space = O(N)
    public int singleNumber2(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (Integer integer: nums) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        for (Integer integer: nums) {
            if (map.get(integer) == 1) return integer;
        }
        return 0;
    }
}
