package sliding_window;

/**
 * 713. Subarray Product Less Than K
 * Medium
 *
 * Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,5,2,6], k = 100
 * Output: 8
 * Explanation: The 8 subarrays that have product less than 100 are:
 * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
 * Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 0
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * 1 <= nums[i] <= 1000
 * 0 <= k <= 106

 */

// TC = O(N)
// SC = O(1)
public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) return 0;

        int left = 0;
        int count = 0;
        int prod = 1;

        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
