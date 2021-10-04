package binary_search;

import org.junit.Test;
import org.testng.Assert;

public class FindMinimumInRotatedSortedArray2Test {

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseOne() {
        int[] nums = new int[]{3,4,5,1,2};
        FindMinimumInRotatedSortedArray2 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2();
        int actual = findMinimumInRotatedSortedArray2.findMin(nums);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseTwo() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        FindMinimumInRotatedSortedArray2 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2();
        int actual = findMinimumInRotatedSortedArray2.findMin(nums);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseThree() {
        int[] nums = new int[]{11,13,15,17};
        FindMinimumInRotatedSortedArray2 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2();
        int actual = findMinimumInRotatedSortedArray2.findMin(nums);
        Assert.assertEquals(actual, 11);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseFour() {
        int[] nums = new int[]{0,1,4,4,5,6,7};
        FindMinimumInRotatedSortedArray2 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2();
        int actual = findMinimumInRotatedSortedArray2.findMin(nums);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseFive() {
        int[] nums = new int[]{2,2,2,0,1};
        FindMinimumInRotatedSortedArray2 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2();
        int actual = findMinimumInRotatedSortedArray2.findMin(nums);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseSix() {
        int[] nums = new int[]{3,3,1,3};
        FindMinimumInRotatedSortedArray2 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2();
        int actual = findMinimumInRotatedSortedArray2.findMin(nums);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseSeven() {
        int[] nums = new int[]{1,3,3};
        FindMinimumInRotatedSortedArray2 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2();
        int actual = findMinimumInRotatedSortedArray2.findMin(nums);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseEight() {
        int[] nums = new int[]{2,2,2,0,2,2};
        FindMinimumInRotatedSortedArray2 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2();
        int actual = findMinimumInRotatedSortedArray2.findMin(nums);
        Assert.assertEquals(actual, 0);
    }
}
