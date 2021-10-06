package binary_search;

import java.util.*;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * <p>
 * <p>
 * Follow up:
 * <p>
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

public class IntersectionOfTwoArraysII {

    // Two pointers solution
    // Time O(max(N,M)) Space O(N)
    public int[] intersectByTwoPointers(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer1 = 0;
        int pointer2 = 0;
        int i = 0;

        // actually we do not need extra array, we could rewrite nums1
        int[] result = new int[nums1.length + nums2.length];

        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            if (nums1[pointer1] == nums2[pointer2]) {
                result[i++] = nums1[pointer1];
                pointer1++;
                pointer2++;
            } else if (nums1[pointer1] < nums2[pointer2]) pointer1++;
            else pointer2++;
        }
        return Arrays.copyOfRange(result, 0, i);
    }

    //Solution one by using HashMap
    //Time O(N + M) Space O(N)
    public int[] intersectByHashMap(int[] nums1, int[] nums2) {

        // that is how we are making sure that nums1 is always the smallest
        if (nums1.length > nums2.length) {
            return intersectByBinarySearch(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);
        }

        List<Integer> interception = new ArrayList<>();
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                interception.add(num);
                map.put(num, count - 1);
            }
        }
        int[] result = new int[interception.size()];
        int i = 0;
        for (Integer integer : interception) {
            result[i++] = integer;
        }
        return result;
    }

    //Solution one by using BinarySearch
    public int[] intersectByBinarySearch(int[] nums1, int[] nums2) {

        // that is how we are making sure that nums1 is always the smallest
        if (nums1.length > nums2.length) {
            return intersectByBinarySearch(nums2, nums1);
        }

        List<Integer> interception = new ArrayList<>();

        Arrays.sort(nums1);
        for (Integer integer : nums2) {
            if (isTargetInArray(nums1, integer)) {
                interception.add(integer);
            }
        }

        int[] result = new int[interception.size()];
        int i = 0;
        for (Integer integer : interception) {
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

