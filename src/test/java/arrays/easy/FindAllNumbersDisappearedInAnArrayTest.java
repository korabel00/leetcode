package arrays.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void testFindAllNumbersDisappearedInAnArrayCaseOne() {
        FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
        int[] arrayUnderTest = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);
        List<Integer> actual = findAllNumbersDisappearedInAnArray.findDisappearedNumbersInPlace(arrayUnderTest);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindAllNumbersDisappearedInAnArrayCaseTwo() {
        FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
        int[] arrayUnderTest = new int[] {1,1};
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        List<Integer> actual = findAllNumbersDisappearedInAnArray.findDisappearedNumbersInPlace(arrayUnderTest);
        Assert.assertEquals(actual, expected);
    }



}
