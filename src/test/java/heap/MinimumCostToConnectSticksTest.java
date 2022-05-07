package heap;

import amazon.MinimumCostToConnectSticks;
import org.junit.Assert;
import org.junit.Test;

public class MinimumCostToConnectSticksTest {

    @Test
    public void caseOne() {
        MinimumCostToConnectSticks test = new MinimumCostToConnectSticks();
        int actual = test.connectSticks(new int[]{2,4,3});
        Assert.assertEquals(14, actual);
    }

    @Test
    public void caseTwo() {
        MinimumCostToConnectSticks test = new MinimumCostToConnectSticks();
        int actual = test.connectSticks(new int[]{1,8,3,5});
        Assert.assertEquals(30, actual);
    }
}
