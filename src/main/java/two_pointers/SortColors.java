package two_pointers;

/**
 * 75. Sort Colors
 * Medium
 *
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 *
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] is either 0, 1, or 2.
 *
 *
 * Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */


// TC = O(N)
// SC = O(1)
public class SortColors {

    public void sortColors(int[] nums) {

        if (nums.length <= 1) return;

        int left = 0;
        int right = nums.length - 1;
        int curr = 0;

        while (curr <= right && left < right) {
            if (nums[curr] == 0) {
                nums[curr] = nums[left];
                nums[left] = 0;
                left++;
                curr++;
            } else if (nums[curr] == 2) {
                nums[curr] = nums[right];
                nums[right] = 2;
                right--;
            } else {
                curr++;
            }
        }
    }
}
