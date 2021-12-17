package hash_table;

import org.junit.Assert;
import org.junit.Test;

public class TopKFrequentElementsTest {

    @Test
    public void tesCaseOne() {
        TopKFrequentElements test = new TopKFrequentElements();
        int[] actual = test.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        int[] expected = {1,2};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void tesCaseTwo() {
        TopKFrequentElements test = new TopKFrequentElements();
        int[] actual = test.topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2);
        int[] expected = {-1,2};
        Assert.assertArrayEquals(expected, actual);
    }
}
