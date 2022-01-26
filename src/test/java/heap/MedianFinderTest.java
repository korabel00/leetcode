package heap;

import org.junit.Test;

public class MedianFinderTest {

    @Test
    public void caseOne() {
        MedianFinder test = new MedianFinder();
        test.addNum(-1);
        test.addNum(-2);
        test.addNum(-3);
        test.addNum(-4);
        double actual = test.findMedian();
    }
}
