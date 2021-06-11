package math.easy;

import math.easy.ReverseInteger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
 * signed 32-bit integer range [-231, 231 - 1], then return 0.
 * * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * Input: x = 123
 * Output: 321
 * Input: x = -123
 * Output: -321
 * Input: x = 120
 * Output: 21
 *
 */

public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @BeforeClass
    public void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void testReverseIntegerOne() {

        int actualValue = reverseInteger.reverse(123);
        Assert.assertEquals(actualValue, 321, "Wrong answer");
    }

    @Test
    public void testReverseIntegerTwo() {

        int actualValue = reverseInteger.reverse(-123);
        Assert.assertEquals(actualValue, -321, "Wrong answer");
    }

    @Test
    public void testReverseIntegerThree() {

        int actualValue = reverseInteger.reverse(120);
        Assert.assertEquals(actualValue, 21, "Wrong answer");
    }

    @Test
    public void testReverseIntegerZero() {

        int actualValue = reverseInteger.reverse(0);
        Assert.assertEquals(actualValue, 0, "Wrong answer");
    }

    @Test
    public void testReverseIntegerSingleOne() {

        int actualValue = reverseInteger.reverse(9);
        Assert.assertEquals(actualValue, 9, "Wrong answer");
    }

    @Test
    public void testReverseIntegerTen() {

        int actualValue = reverseInteger.reverse(10);
        Assert.assertEquals(actualValue, 1, "Wrong answer");
    }

    @Test
    public void testReverseBigInteger() {

        int actualValue = reverseInteger.reverse(900000);
        Assert.assertEquals(actualValue, 9, "Wrong answer");
    }

    @Test
    public void testReverseOverInteger() {

        int actualValue = reverseInteger.reverse(2_147_483_647);
        Assert.assertEquals(actualValue, 0, "Wrong answer");
    }

    @AfterClass
    public void tearDown() {
        reverseInteger = null;
    }
}