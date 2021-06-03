package arrays.easy;

import arrays.easy.FindNumbersWithEvenNumberOfDigits;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void testEvenNumberOfDigitsCaseOne () {

        FindNumbersWithEvenNumberOfDigits evenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        int actual = evenNumberOfDigits.findNumbers(new int[]{12,345,2,6,7896});
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testEvenNumberOfDigitsCaseTwo() {

        FindNumbersWithEvenNumberOfDigits evenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        int actual = evenNumberOfDigits.findNumbers(new int[]{555,901,482,1771});
        int expected = 1;
        Assert.assertEquals(actual,expected);
    }
}
