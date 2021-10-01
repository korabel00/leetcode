package binary_search;

import org.junit.Assert;
import org.junit.Test;

public class ValidPerfectSquareTest {

    @Test
    public void testValidPerfectSquareCaseOne () {
        ValidPerfectSquare validPerfectSquare =  new ValidPerfectSquare();
        boolean actual = validPerfectSquare.isPerfectSquare(16);
        Assert.assertTrue(actual);
    }

    @Test
    public void testValidPerfectSquareCaseTwo () {
        ValidPerfectSquare validPerfectSquare =  new ValidPerfectSquare();
        boolean actual = validPerfectSquare.isPerfectSquare(5);
        Assert.assertFalse(actual);
    }
}
