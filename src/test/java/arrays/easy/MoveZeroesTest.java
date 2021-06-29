package arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void testMoveZeroesCaseOne() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] arrayUnderTest = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};
        moveZeroes.moveZeroes(arrayUnderTest);
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }

    @Test
    public void testMoveZeroesCaseTwo() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] arrayUnderTest = {0};
        int[] expected = {0};
        moveZeroes.moveZeroes(arrayUnderTest);
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }
}
