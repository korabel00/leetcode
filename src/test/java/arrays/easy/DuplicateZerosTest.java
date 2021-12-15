package arrays.easy;

import arrays.DuplicateZeros;
import org.junit.Assert;
import org.junit.Test;

public class DuplicateZerosTest {

    @Test
    public void testDuplicateZerosCaseOne() {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] arrayUnderTest = {1,0,2,3,0,4,5,0};
        duplicateZeros.duplicateZeros(arrayUnderTest);
        int[] expected = {1,0,0,2,3,0,0,4};
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }

    @Test
    public void testDuplicateZerosCaseTwo() {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] arrayUnderTest = {1,2,3};
        duplicateZeros.duplicateZeros(arrayUnderTest);
        int[] expected = {1,2,3};
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }

    @Test
    public void testDuplicateZerosCaseThree() {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] arrayUnderTest = {0,0,0,0,0,0,0};
        duplicateZeros.duplicateZeros(arrayUnderTest);
        int[] expected = {0,0,0,0,0,0,0};
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }
}
