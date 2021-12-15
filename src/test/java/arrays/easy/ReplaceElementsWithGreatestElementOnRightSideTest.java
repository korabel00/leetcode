package arrays.easy;

import arrays.ReplaceElementsWithGreatestElementOnRightSide;
import org.junit.Assert;
import org.junit.Test;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    @Test
    public void testReplaceElementsWithGreatestElementOnRightSideCaseOne() {

        ReplaceElementsWithGreatestElementOnRightSide test = new ReplaceElementsWithGreatestElementOnRightSide();
        int [] arrayUnderTest = {17,18,5,4,6,1};
        int [] expected = {18,6,6,6,1,-1};
        test.replaceElements(arrayUnderTest);
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }

    @Test
    public void testReplaceElementsWithGreatestElementOnRightSideCaseTwo() {

        ReplaceElementsWithGreatestElementOnRightSide test = new ReplaceElementsWithGreatestElementOnRightSide();
        int [] arrayUnderTest = {400};
        int [] expected = {-1};
        test.replaceElements(arrayUnderTest);
        Assert.assertArrayEquals(expected, arrayUnderTest);
    }
}
