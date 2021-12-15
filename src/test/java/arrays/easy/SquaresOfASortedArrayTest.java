package arrays.easy;

import arrays.SquaresOfASortedArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquaresOfASortedArrayTest {

    @Test
    public void testSquaresOfASortedArrayTestCaseOne () {

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] actual = squaresOfASortedArray.sortedSquaresBruteForce(new int[]{-4,-1,0,3,10});
        int[] expected = {0,1,9,16,100};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSquaresOfASortedArrayTestCaseTwo() {

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] actual = squaresOfASortedArray.sortedSquaresBruteForce(new int[]{-7,-3,2,3,11});
        int[] expected = {4,9,9,49,121};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSquaresOfASortedArrayTestCaseThree () {

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] actual = squaresOfASortedArray.sortedSquares(new int[]{-4,-1,0,3,10});
        int[] expected = {0,1,9,16,100};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSquaresOfASortedArrayTestCaseFour() {

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] actual = squaresOfASortedArray.sortedSquares(new int[]{-7,-3,2,3,11});
        int[] expected = {4,9,9,49,121};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSquaresOfASortedArrayTestCaseFive() {

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] actual = squaresOfASortedArray.sortedSquares(new int[]{-1});
        int[] expected = {1};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSquaresOfASortedArrayTestCaseSix() {

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] actual = squaresOfASortedArray.sortedSquares(new int[]{-5,-3,-2,-1});
        int[] expected = {1, 4, 9, 25};
        Assert.assertEquals(actual,expected);
    }
}
