package binary_search;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoArraysTestII {

    @Test
    public void testIntersectionOfTwoArraysIICaseOne() {

        IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
        int[] actual = intersectionOfTwoArraysII.intersect(new int[]{1,2,2,1}, new int[]{2,2});
        Assert.assertArrayEquals(new int[]{2,2}, actual);
    }

    @Test
    public void testIntersectionOfTwoArraysIICaseTwo() {

        IntersectionOfTwoArraysII IntersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
        int[] actual = IntersectionOfTwoArraysII.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        Assert.assertArrayEquals(new int[]{4,9}, actual);
    }

    @Test
    public void testIntersectionOfTwoArraysIICaseThree() {

        IntersectionOfTwoArraysII IntersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
        int[] actual = IntersectionOfTwoArraysII.intersect(new int[]{3,1,2}, new int[]{1,1});
        Assert.assertArrayEquals(new int[]{1}, actual);
    }
}
