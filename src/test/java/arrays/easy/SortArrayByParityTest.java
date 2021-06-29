package arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityTest {

    @Test
    public void testSortArrayByParityCaseOne() {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] arrayUnderTest = {3,1,2,4};
        int[] expected = {4,2,1,3};
        sortArrayByParity.sortArrayByParity(arrayUnderTest);
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }

    @Test
    public void testSortArrayByParityCaseTwo() {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] arrayUnderTest = {3,1,2,4,5};
        int[] expected = {4,2,1,3,5};
        sortArrayByParity.sortArrayByParity(arrayUnderTest);
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }

    @Test
    public void testSortArrayByParityCaseThree() {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] arrayUnderTest = {3,1,2,4};
        int[] expected = {2,4,3,1};
        sortArrayByParity.sortArrayByParitySimple(arrayUnderTest);
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }

    @Test
    public void testSortArrayByParityCaseFour() {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] arrayUnderTest = {3,1,2,4,5};
        int[] expected = {2,4,3,1,5};
        sortArrayByParity.sortArrayByParitySimple(arrayUnderTest);
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }
}
