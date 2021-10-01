package binary_search;

import org.junit.Assert;
import org.junit.Test;

public class PowTest {

    @Test
    public void testPowCaseOne() {
        Pow pow = new Pow();
        double actual = pow.myPow(2.00000, 10);
        Assert.assertEquals(1024.00000, actual, 0.00001);
    }

    @Test
    public void testPowCaseTwo() {
        Pow pow = new Pow();
        double actual = pow.myPow(2.10000, 3);
        Assert.assertEquals(9.26100, actual, 0.00001);
    }

    @Test
    public void testPowCaseThree() {
        Pow pow = new Pow();
        double actual = pow.myPow(2.00000, -2);
        Assert.assertEquals(0.25000, actual, 0.00001);
    }

    @Test
    public void testPowCaseFour() {
        Pow pow = new Pow();
        double actual = pow.myPow(-1.00000, -2147483648);
        Assert.assertEquals(1.00000, actual, 0.00001);
    }
}
