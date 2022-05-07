package binary_search;

import amazon.FindKClosestElementsTwoPointers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindKClosestElementsTest {

    @Test
    public void testFindKClosestElementsCaseOne() {
        FindKClosestElementsTwoPointers findKClosestElements = new FindKClosestElementsTwoPointers();
        List<Integer> actual = findKClosestElements.findClosestElements(new int[]{1,2,3,4,5,6,7}, 4, -1);
        Assert.assertEquals(4, actual.size());
        Assert.assertEquals(1, (int) actual.get(0));
        Assert.assertEquals(2, (int) actual.get(1));
        Assert.assertEquals(3, (int) actual.get(2));
        Assert.assertEquals(4, (int) actual.get(3));
    }

    @Test
    public void testFindKClosestElementsCaseTwo() {
        FindKClosestElementsTwoPointers findKClosestElements = new FindKClosestElementsTwoPointers();
        List<Integer> actual = findKClosestElements.findClosestElements(new int[]{1,2,3,4,5,6,7}, 4, 7);
        Assert.assertEquals(4, actual.size());
        Assert.assertEquals(4, (int) actual.get(0));
        Assert.assertEquals(5, (int) actual.get(1));
        Assert.assertEquals(6, (int) actual.get(2));
        Assert.assertEquals(7, (int) actual.get(3));
    }

    @Test
    public void testFindKClosestElementsCaseThree() {
        FindKClosestElementsTwoPointers findKClosestElements = new FindKClosestElementsTwoPointers();
        List<Integer> actual = findKClosestElements.findClosestElements(new int[]{1,2,3,4,5,6,7}, 4, 4);
        Assert.assertEquals(4, actual.size());
        Assert.assertEquals(2, (int) actual.get(0));
        Assert.assertEquals(3, (int) actual.get(1));
        Assert.assertEquals(4, (int) actual.get(2));
        Assert.assertEquals(5, (int) actual.get(3));
    }

    @Test
    public void testFindKClosestElementsCaseFour() {
        FindKClosestElementsTwoPointers findKClosestElements = new FindKClosestElementsTwoPointers();
        List<Integer> actual = findKClosestElements.findClosestElements(new int[]{-2,-1,1,2,3,4,5}, 7, 3);
        Assert.assertEquals(7, actual.size());
        Assert.assertEquals(-2, (int) actual.get(0));
        Assert.assertEquals(-1, (int) actual.get(1));
        Assert.assertEquals(1, (int) actual.get(2));
        Assert.assertEquals(2, (int) actual.get(3));
        Assert.assertEquals(3, (int) actual.get(4));
        Assert.assertEquals(4, (int) actual.get(5));
        Assert.assertEquals(5, (int) actual.get(6));
    }

    @Test
    public void testFindKClosestElementsCaseFive() {
        FindKClosestElementsTwoPointers findKClosestElements = new FindKClosestElementsTwoPointers();
        List<Integer> actual = findKClosestElements.findClosestElements(new int[]{0,0,0,1,3,5,6,7,8,8}, 2, 2);
        Assert.assertEquals(2, actual.size());
        Assert.assertEquals(1, (int) actual.get(0));
        Assert.assertEquals(3, (int) actual.get(1));
    }
}
