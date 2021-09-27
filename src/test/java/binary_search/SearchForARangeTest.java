package binary_search;

import org.junit.Assert;
import org.junit.Test;

public class SearchForARangeTest {

    @Test
    public void testSearchForARangeCaseOne() {
        int[] nums = new int[] {5,7,7,8,8,10};
        SearchForARange searchForARange = new SearchForARange();
        Assert.assertArrayEquals(new int[] {3,4}, searchForARange.searchRange(nums, 8));
    }
}
