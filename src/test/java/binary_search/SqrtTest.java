package binary_search;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {

    @Test
    public void testSqrtCaseOne() {
        Sqrt sqrt = new Sqrt();
        int actual = sqrt.mySqrt(8);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testSqrtCaseTwo() {
        Sqrt sqrt = new Sqrt();
        int actual = sqrt.mySqrt(3);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testSqrtCaseThree() {
        Sqrt sqrt = new Sqrt();
        int actual = sqrt.mySqrt(2147395599);
        Assert.assertEquals(46339, actual);
    }
}
