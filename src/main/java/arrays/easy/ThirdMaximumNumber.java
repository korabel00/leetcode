package arrays.easy;

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

// Time O(N) Space O(1)
public class ThirdMaximumNumber {

    public int findThirdMax(int[] nums) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == firstMax || nums[i] == secondMax || nums[i] == thirdMax) {
                continue;
            }

            if (firstMax == Integer.MIN_VALUE || nums[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (secondMax == Integer.MIN_VALUE || nums[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if (thirdMax == Integer.MIN_VALUE || nums[i] > thirdMax) {
                thirdMax = nums[i];
            }
        }
        if (thirdMax == Integer.MIN_VALUE) {
            return firstMax;
        }
        return thirdMax;
    }
}
