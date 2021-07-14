package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 *
 *
 * Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */

//Google Microsoft
// Time O(N) Space O(1)
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++){
            result.add(i);
        }
        for (int num : nums) {
            if (result.contains(num)) {
                result.remove((Integer) num);
            }
        }
        return result;
    }

/*1.We iterate through the input array and mark elements as negative using
nums[nums[i]-1] = -nums[nums[i]-1]. So if we have seen 4 for example, we mark its position at index 3 as negative
In this way all the numbers that we have seen will be marked as negative.
If 5 is not there we will not mark index 4

2.In the second iteration, if a value is not marked as negative, it implies we have never seen that index before,
so just add it to the return list.*/

    // Time O(N) Space O(1)
    public List<Integer> findDisappearedNumbersInPlace(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            // Find its index
            int index = Math.abs(num) - 1;// Math.abs we use in case we marked that position before
            // Update the element at the found index
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }


}
