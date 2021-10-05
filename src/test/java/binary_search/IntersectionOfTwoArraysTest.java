package binary_search;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoArraysTest {

    @Test
    public void testIntersectionOfTwoArrays() {

        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int[] actual = intersectionOfTwoArrays.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        Assert.assertArrayEquals(new int[]{4,9}, actual);
    }

    @Test
    public void testIntersectionOfTwoArraysBinary() {

        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int[] actual = intersectionOfTwoArrays.intersectionByBinarySearch(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        Assert.assertArrayEquals(new int[]{4,9}, actual);
    }
}
