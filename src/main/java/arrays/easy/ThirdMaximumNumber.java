package arrays.easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,1]
 * Output: 1
 * Explanation: The third maximum is 1.
 * Example 2:
 *
 * Input: nums = [1,2]
 * Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3:
 *
 * Input: nums = [2,2,3,1]
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Can you find an O(n) solution?
 */

// Time O(N) Space O(N)
public class ThirdMaximumNumber {

    public int findThirdMax(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() < 3) {
            return Collections.max(set);
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int val : set) {
            if (val > first) {
                third = second;
                second = first;
                first = val;
            } else if (val > second) {
                third = second;
                second = val;
            } else if (val > third) {
                third = val;
            }
        }
        return third;
    }
}
