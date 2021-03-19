package easy.two_sum;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 * * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

public class TwoSumTest {

    private TwoSum twoSum;

    @BeforeClass
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testTwoSumByBruteForce() {

        long start = System.nanoTime();
        int[] actualValue = twoSum.findTwoSumByBruteForce(new int[]{2,7,11,15}, 9);
        long stop = System.nanoTime();
        System.out.printf("brute force: %,d %n", stop - start);
        Assert.assertEquals(actualValue, new int[]{0,1}, "Wrong answer");
    }

    @Test
    public void testTwoSumByMap() {

        long start = System.nanoTime();
        int[] actualValue = twoSum.findTwoSumByMap(new int[]{3,2,4}, 6);
        long stop = System.nanoTime();
        System.out.printf("map: %,d %n", stop - start);
        Assert.assertEquals(actualValue, new int[]{1,2}, "Wrong answer");
    }

    @AfterClass
    public void tearDown() {
        twoSum = null;
    }

}