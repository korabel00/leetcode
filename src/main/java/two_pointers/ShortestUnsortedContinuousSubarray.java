package two_pointers;

import java.util.Arrays;

/**
 * 581. Shortest Unsorted Continuous Subarray
 * <p>
 * Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.
 * <p>
 * Return the shortest such subarray and output its length.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,6,4,8,10,9,15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: 0
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -105 <= nums[i] <= 105
 * <p>
 * <p>
 * Follow up: Can you solve it in O(n) time complexity?
 */

// Time complexity : O(nlogn). Sorting takes nlogn time.
// Space complexity : O(n). We are making copy of original array.
public class ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {

        if (nums == null || nums.length <= 1) return 0;

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        int start = sortedNums.length, end = 0;
        for (int i = 0; i < sortedNums.length; i++) {
            if (sortedNums[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        if (end - start >= 0) {
            return end - start + 1;
        } else  {
            return 0;
        }
    }
}

// [2,6,4,8,10,9,15]
// [1,2,3,4,5,9,6,8]
// [1,2,3,4,5,9,15,8]


