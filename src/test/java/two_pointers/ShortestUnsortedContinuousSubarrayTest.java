package two_pointers;

import org.junit.Assert;
import org.junit.Test;

public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void caseOne() {
        ShortestUnsortedContinuousSubarray test = new ShortestUnsortedContinuousSubarray();
        int actual = test.findUnsortedSubarray(new int[]{2,6,4,8,10,9,15});
        Assert.assertEquals(5, actual);
    }

    @Test
    public void caseTwo() {
        ShortestUnsortedContinuousSubarray test = new ShortestUnsortedContinuousSubarray();
        int actual = test.findUnsortedSubarray(new int[]{1,2});
        Assert.assertEquals(0, actual);
    }
}
