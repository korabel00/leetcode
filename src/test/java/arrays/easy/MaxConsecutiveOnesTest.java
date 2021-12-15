package arrays.easy;

import arrays.MaxConsecutiveOnes;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void testMaxConsecutiveOnesCaseOne () {

        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int actual = maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        int expected = 3;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testMaxConsecutiveOnesCaseTwo() {

        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int actual = maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1});
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }
}
