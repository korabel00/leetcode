package arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class ThirdMaximumNumberTest {

    @Test
    public void testThirdMaximumNumberCaseOne() {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int[] arrayUnderTest = {3,2,1};
        int actual = thirdMaximumNumber.findThirdMax(arrayUnderTest);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testThirdMaximumNumberCaseTwo() {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int[] arrayUnderTest = {1, 2};
        int actual = thirdMaximumNumber.findThirdMax(arrayUnderTest);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testThirdMaximumNumberCaseThree() {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int[] arrayUnderTest = {2,2,3,1};
        int actual = thirdMaximumNumber.findThirdMax(arrayUnderTest);
        Assert.assertEquals(1, actual);
    }
}
