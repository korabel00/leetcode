package sliding_window;

/**
 * 209. Minimum Size Subarray Sum
 * Medium
 * <p>
 * <p>
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 * <p>
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 * <p>
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 * <p>
 * <p>
 * Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
 */

// TC = O(N)
// SC = O(1)
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

        // we track sum and minimum length (currSum, currLen, minLen)
        // slide through nums
        // if sum < target -> add new element to the right and update right++
        // if sum >= target -> compare current minimum length, update sum, update left pointer++

        int windowStart = 0;
        int windowSum = 0;
        int currLen = 0;
        int minLen = Integer.MAX_VALUE;


        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            currLen++;
            // we use while not if because we want to shrink the window as small as possible
            while (windowSum >= target) {
                minLen = Math.min(minLen, currLen);
                windowSum -= nums[windowStart];
                windowStart++;
                currLen--;
            }
        }
        if (minLen == Integer.MAX_VALUE) return 0;
        else return minLen;
    }
}
