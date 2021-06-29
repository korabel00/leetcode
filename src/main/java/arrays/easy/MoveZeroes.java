package arrays.easy;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Could you minimize the total number of operations done?
 */

// Time O(N) Space O(1)
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int writePointer = 0;
        // Count number of zeros. If not zero override the number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writePointer] = nums[i];
                writePointer++;
            }
        }
        // From the point where writePointer stopped until the end of an array write zeros
        for (int i = writePointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
