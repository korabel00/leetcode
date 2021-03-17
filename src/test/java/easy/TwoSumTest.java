package easy;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TwoSumTest {

    private TwoSum twoSum;

    @BeforeClass
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testTwoSumByBruteForce() {

        long start = System.nanoTime();
        int[] actualValue = twoSum.findTwoSumByBruteForce(new int[]{2,7,11,15}, 9);
        long stop = System.nanoTime();
        System.out.printf("brute force: %,d %n", stop - start);
        Assert.assertEquals(actualValue, new int[]{0,1}, "Wrong answer");
    }

    @Test
    public void testTwoSumByMap() {

        long start = System.nanoTime();
        int[] actualValue = twoSum.findTwoSumByMap(new int[]{3,2,4}, 6);
        long stop = System.nanoTime();
        System.out.printf("map: %,d %n", stop - start);
        Assert.assertEquals(actualValue, new int[]{1,2}, "Wrong answer");
    }

    @AfterClass
    public void tearDown() {
        twoSum = null;
    }

}