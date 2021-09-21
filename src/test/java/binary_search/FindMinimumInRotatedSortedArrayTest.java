package binary_search;

import org.junit.Test;
import org.testng.Assert;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseOne() {
        int[] nums = new int[]{3,4,5,1,2};
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int actual = findMinimumInRotatedSortedArray.findMin(nums);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseTwo() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int actual = findMinimumInRotatedSortedArray.findMin(nums);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCaseThree() {
        int[] nums = new int[]{11,13,15,17};
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int actual = findMinimumInRotatedSortedArray.findMin(nums);
        Assert.assertEquals(actual, 11);
    }
}
