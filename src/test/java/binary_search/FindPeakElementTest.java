package binary_search;

import org.junit.Test;
import org.testng.Assert;

public class FindPeakElementTest {

    @Test
    public void testFindPeakElementCaneOne() {
        int[] nums = new int[]{1,2,3,1};
        FindPeakElement findPeakElement = new FindPeakElement();
        int actual = findPeakElement.findPeakElement(nums);
        Assert.assertEquals(actual, 2);
    }

    @Test
    public void testFindPeakElementCaneTwo() {
        int[] nums = new int[]{1,2,1,3,5,6,4};
        FindPeakElement findPeakElement = new FindPeakElement();
        int actual = findPeakElement.findPeakElement(nums);
        Assert.assertEquals(actual, 5);
    }
}
