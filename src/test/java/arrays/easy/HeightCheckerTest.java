package arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class HeightCheckerTest {

    @Test
    public void testHeightCheckerCaseOne() {
        HeightChecker heightChecker = new HeightChecker();
        int actual = heightChecker.heightChecker(new int[]{1,1,4,2,1,3});
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testHeightCheckerCaseTwo() {
        HeightChecker heightChecker = new HeightChecker();
        int actual = heightChecker.heightChecker(new int[]{5,1,2,3,4});
        Assert.assertEquals(5, actual);
    }

    @Test
    public void testHeightCheckerCaseThree() {
        HeightChecker heightChecker = new HeightChecker();
        int actual = heightChecker.heightChecker(new int[]{1,2,3,4,5});
        Assert.assertEquals(0, actual);
    }
}
