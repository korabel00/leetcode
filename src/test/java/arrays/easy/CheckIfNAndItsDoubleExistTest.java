package arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNAndItsDoubleExistTest {

    @Test
    public void testCheckIfNAndItsDoubleExistCaseOne() {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        boolean expected = checkIfNAndItsDoubleExist.checkIfExist(new int[]{10,2,5,3});
        Assert.assertTrue(expected);
    }

    @Test
    public void testCheckIfNAndItsDoubleExistCaseTwo() {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        boolean expected = checkIfNAndItsDoubleExist.checkIfExist(new int[]{7,1,14,11});
        Assert.assertTrue(expected);
    }

    @Test
    public void testCheckIfNAndItsDoubleExistCaseThree() {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        boolean expected = checkIfNAndItsDoubleExist.checkIfExist(new int[]{3,1,7,11});
        Assert.assertFalse(expected);
    }

    @Test
    public void testCheckIfNAndItsDoubleExistOnePassCaseOne() {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        boolean expected = checkIfNAndItsDoubleExist.checkIfExistOnePass(new int[]{10,2,5,3});
        Assert.assertTrue(expected);
    }

    @Test
    public void testCheckIfNAndItsDoubleExistOnePassCaseTwo() {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        boolean expected = checkIfNAndItsDoubleExist.checkIfExistOnePass(new int[]{7,1,14,11});
        Assert.assertTrue(expected);
    }

    @Test
    public void testCheckIfNAndItsDoubleExistOnePassCaseThree() {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        boolean expected = checkIfNAndItsDoubleExist.checkIfExistOnePass(new int[]{3,1,7,11});
        Assert.assertFalse(expected);
    }
}
