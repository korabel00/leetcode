package binary_search;

import arrays.TwoSumII;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumIITest {

    @Test
    public void testTwoSumIICaseOne() {
        TwoSumII twoSumII = new TwoSumII();
        int[] actual = twoSumII.twoSumByHashMap(new int[]{2,7,11,15}, 9);
        Assert.assertArrayEquals(new int[]{1,2}, actual);
    }

    @Test
    public void testTwoSumIICaseTwo() {
        TwoSumII twoSumII = new TwoSumII();
        int[] actual = twoSumII.twoSumByHashMap(new int[]{2,3,4}, 6);
        Assert.assertArrayEquals(new int[]{1,3}, actual);
    }

    @Test
    public void testTwoSumIICaseThree() {
        TwoSumII twoSumII = new TwoSumII();
        int[] actual = twoSumII.twoSumByHashMap(new int[]{-1,0}, -1);
        Assert.assertArrayEquals(new int[]{1,2}, actual);
    }

    @Test
    public void testTwoSumIICaseFour() {
        TwoSumII twoSumII = new TwoSumII();
        int[] actual = twoSumII.twoSumByHashMap(new int[]{0,0,3,4}, 0);
        Assert.assertArrayEquals(new int[]{1,2}, actual);
    }
}
