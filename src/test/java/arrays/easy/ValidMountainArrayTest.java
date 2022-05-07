package arrays.easy;

import amazon.ValidMountainArray;
import org.junit.Assert;
import org.junit.Test;

public class ValidMountainArrayTest {

    @Test
     public void testValidMountainArrayCaseOne() {

        ValidMountainArray validMountainArray = new ValidMountainArray();
        boolean actual = validMountainArray.validMountainArray(new int[]{2,1});
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidMountainArrayCaseTwo() {

        ValidMountainArray validMountainArray = new ValidMountainArray();
        boolean actual = validMountainArray.validMountainArray(new int[]{3,5,5});
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidMountainArrayCaseThree() {

        ValidMountainArray validMountainArray = new ValidMountainArray();
        boolean actual = validMountainArray.validMountainArray(new int[]{0,3,2,1});
        Assert.assertTrue(actual);
    }

    @Test
    public void testValidMountainArrayCaseFour() {

        ValidMountainArray validMountainArray = new ValidMountainArray();
        boolean actual = validMountainArray.validMountainArray(new int[]{2});
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidMountainArrayCaseFive() {

        ValidMountainArray validMountainArray = new ValidMountainArray();
        boolean actual = validMountainArray.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9});
        Assert.assertFalse(actual);
    }
}
