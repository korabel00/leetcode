package arrays.easy;

import arrays.easy.MaximumSubArray;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum
 * and return its sum.
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -105 <= nums[i] <= 105
 *
 *
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubArrayTest {

    @Test
    public void testMaxSubArrayZero() {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int actual = maximumSubArray.maxSubArrayKadenes(new int[]{-2,3,2,-1});
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMaxSubArray() {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int actual = maximumSubArray.maxSubArrayKadenes(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        int expected = 6; // Explanation: [4,-1,2,1] has the largest sum = 6.
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMaxSubArrayTwo() {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int actual = maximumSubArray.maxSubArrayKadenes(new int[]{1});
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMaxSubArrayThree() {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int actual = maximumSubArray.maxSubArrayKadenes(new int[]{5,4,-1,7,8});
        int expected = 23;
        Assert.assertEquals(actual, expected);
    }
}