package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 *
 *
 * Constraints:
 *
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 *
 *
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> interception = new ArrayList<>();

        if (nums1.length > nums2.length) {
            Arrays.sort(nums1);
            for (Integer integer: nums2) {
                if (isTargetInArray(nums1, integer)) {
                    interception.add(integer);
                }
            }
        } else {
            Arrays.sort(nums2);
            for (Integer integer: nums1) {
                if (isTargetInArray(nums2, integer)) {
                    interception.add(integer);
                }
            }
        }

        int[] result = new int[interception.size()];
        int i = 0;
        for (Integer integer: interception) {
            result[i++] = integer;
        }
        return result;
    }

    private boolean isTargetInArray (int[] nums1, int target) {

        int left = 0;
        int right = nums1.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums1[mid] == target) return true;
            else if (nums1[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}

