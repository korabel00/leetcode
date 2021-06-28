package arrays.easy;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum
 * and return its sum.
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -105 <= nums[i] <= 105
 *
 *
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

//Amazon
//Microsoft
//LinkedIn

//Kadene's Algorithm
//Time O(N) Space O(1)
public class MaximumSubArray {

    public int maxSubArrayKadenes(int[] nums) {

        int maxSum = nums[0];
        int currentSum = maxSum;

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if (currentSum > maxSum) maxSum = currentSum; // or maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

//  |   nums[i]         |   -2  |   3   |   2   |   -1  |
//  | current + nums[i] |   0   |   1   |   5   |   4   |
//  |   current         |   -2  |   3   |   5   |   4   |
//  |   max             |   -2  |   3   |   5   |   5   |

}