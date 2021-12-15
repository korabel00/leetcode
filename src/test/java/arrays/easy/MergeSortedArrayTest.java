package arrays.easy;

import arrays.MergeSortedArray;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void testMergeSortedArrayCaseOne() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        int [] expected = {1,2,2,3,5,6};
        Assert.assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeSortedArrayCaseTwo() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1};
        int[] nums2 = {};
        mergeSortedArray.merge(nums1, 1, nums2, 0);
        int [] expected = {1};
        Assert.assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeSortedArrayCaseThree() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {0};
        int[] nums2 = {1};
        mergeSortedArray.merge(nums1, 0, nums2, 1);
        int [] expected = {1};
        Assert.assertArrayEquals(expected, nums1);
    }
}
