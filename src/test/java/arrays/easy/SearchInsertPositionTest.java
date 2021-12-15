package arrays.easy;

import arrays.SearchInsertPosition;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.

 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:

 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:

 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * Example 4:

 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * Example 5:

 * Input: nums = [1], target = 0
 * Output: 0

 * Constraints:

 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */

public class SearchInsertPositionTest {

    @Test
    public void testBinarySearchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.binarySearchInsert(new int[]{1,3,5,6}, 5);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBinarySearchInsertTwo() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.binarySearchInsert(new int[]{1,3}, 3);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBinarySearchInsertThree() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.binarySearchInsert(new int[]{1}, 0);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBinarySearchInsertFour() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.binarySearchInsert(new int[]{1,3,5,6}, 2);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testLinearSearchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.linearSearchInsert(new int[]{1,3,5,6}, 5);
        int actualBinary = searchInsertPosition.binarySearchInsert(new int[]{1,3,5,6}, 5);
        int expected = 2;
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actualBinary, expected);
    }

    @Test
    public void testLinearSearchInsertTwo() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.linearSearchInsert(new int[]{1,3,5,6}, 2);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testLinearSearchInsertThree() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.linearSearchInsert(new int[]{1,3,5,6}, 7);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testLinearSearchInsertFour() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.linearSearchInsert(new int[]{1,3,5,6}, 0);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testLinearSearchInsertFive() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.linearSearchInsert(new int[]{1}, 0);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testLinearSearchInsertSix() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actual = searchInsertPosition.linearSearchInsert(new int[]{1,3}, 3);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
}