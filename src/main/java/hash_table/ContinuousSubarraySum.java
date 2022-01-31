package hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. Continuous Subarray Sum
 * Medium
 *
 * 1357
 *
 * 192
 *
 * Add to List
 *
 * Share
 * Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.
 *
 * An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [23,2,4,6,7], k = 6
 * Output: true
 * Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
 * Example 2:
 *
 * Input: nums = [23,2,6,4,7], k = 6
 * Output: true
 * Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
 * 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
 * Example 3:
 *
 * Input: nums = [23,2,6,4,7], k = 13
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 109
 * 0 <= sum(nums[i]) <= 231 - 1
 * 1 <= k <= 231 - 1
 */

public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {

        //create prefix sum map==  key: sum % k, val: index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int mod  = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
            mod =  sum % k;
            //when map contains mod, it means that there exist an subarray from 0~j (j=map.get(mod)) where its sum%k==mod.
            //which means that subarray sum( j~i) %k==0.
            if(map.containsKey(mod) && i - map.get(mod) > 1) {
                return true;
            }
            map.putIfAbsent(mod,i);
        }
        return false;
    }
}
