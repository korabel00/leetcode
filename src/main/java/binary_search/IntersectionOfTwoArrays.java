package binary_search;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 *
 *
 * Constraints:
 *
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */

// easy
// Time O(N) Space O(N)
// Lyft Facebook
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        int minLength = Math.min(nums1.length, nums2.length);
        HashSet<Integer> hashSet1 = new HashSet<>(minLength);
        HashSet<Integer> intersection = new HashSet<>(minLength);

        for (int i : nums1) {
            hashSet1.add(i);
        }

        for (int i : nums2) {
            if (hashSet1.contains(i)) {
                intersection.add(i);
            }
        }

        int[] result = new int[intersection.size()];

        int i = 0;
        for (Integer integer: intersection) {
            result[i] = integer;
            i++;
        }
        return result;
    }

    public int[] intersectionByBinarySearch(int[] nums1, int[] nums2) {

        int minLength = Math.min(nums1.length, nums2.length);
        HashSet<Integer> intersection = new HashSet<>(minLength);

        Arrays.sort(nums1);

        for (int target: nums2) {
            if (isTargetInArray(nums1, target)) {
                intersection.add(target);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer integer: intersection) {
            result[i++] = integer;
        }
        return result;
    }

    private boolean isTargetInArray(int[] nums1, int target) {

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
