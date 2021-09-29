package binary_search;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
 *
 * An integer a is closer to x than an integer b if:
 *
 * |a - x| < |b - x|, or
 * |a - x| == |b - x| and a < b
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3,4,5], k = 4, x = 3
 * Output: [1,2,3,4]
 * Example 2:
 *
 * Input: arr = [1,2,3,4,5], k = 4, x = -1
 * Output: [1,2,3,4]
 *
 *
 * Constraints:
 *
 * 1 <= k <= arr.length
 * 1 <= arr.length <= 104
 * arr is sorted in ascending order.
 * -104 <= arr[i], x <= 104
 */

//Time O(N) (Because of using Two Pointers) Space O(1)
public class FindKClosestElementsTwoPointers {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // in case k == arr.length
        if (k == arr.length) return getSubListArray(arr,0, arr.length - 1);

        // in case x = -1 or x = 1 and arr[] is [1,2,3,4,5,6,7]
        if (x <= arr[0]) return getSubListArray(arr,0, k - 1);

        // in case x = 8 or x = 7 and arr[] is the same
        if (x >= arr[arr.length - 1]) return getSubListArray(arr,arr.length - k, arr.length - 1);

        // in case x = 4 and arr[] is the same
        int left = 0;
        int right = arr.length - 1;
        while ((Math.abs(right) - Math.abs(left)) >= k) {
            if (Math.abs(arr[left] - x) < Math.abs(arr[right] - x)) right--;
            else if (Math.abs(arr[left] - x) == Math.abs(arr[right] - x) && Math.abs(arr[left]) < Math.abs(arr[right])) right--;
            else left++;
        }
        return getSubListArray(arr, left, right);
    }

    private List<Integer> getSubListArray(int[] arr, int start, int end) {

        List<Integer> listToReturn = new ArrayList<>();
        for (int i = start; i <= end; i ++) {
            listToReturn.add(arr[i]);
        }
        return listToReturn;
    }
}
