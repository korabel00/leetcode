package amazon;

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * Example 3:
 *
 * Input: nums = [1], target = 0
 * Output: -1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5000
 * -104 <= nums[i] <= 104
 * All values of nums are unique.
 * nums is guaranteed to be rotated at some pivot.
 * -104 <= target <= 104
 */

//medium
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        //We are looking for the smallest element here. left is responsible for that.
        while (left < right) {
            int mid = left + (right - left) / 2;
            // for that case [4,5,6,7,0,1,2]
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else right = mid;
        }

        //Then we need to find whether the target element is in array or not
        int pivot = left;
        left = 0;
        right = nums.length - 1;

        // if the target is in the right side reset the left boundary
        if (target >= nums[pivot] && target <= nums[right]) {
            left = pivot;
        // if the target is in the left side reset the right boundary
        } else {
            right = pivot;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target < nums[mid]) right = mid - 1;
            else if (target > nums[mid]) left = mid + 1;
            else return mid;
        }
        return -1;
    }
}
