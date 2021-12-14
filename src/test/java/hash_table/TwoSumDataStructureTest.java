package hash_table;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumDataStructureTest {

    @Test
    public void testTwoSumDataStructure() {

        TwoSumDataStructureDesign test =  new TwoSumDataStructureDesign();
        test.add(1);
        test.add(3);
        test.add(5);
        Assert.assertTrue(test.find(4));
        Assert.assertFalse(test.find(7));
    }

    @Test
    public void testTwoSumDataStructure2() {

        TwoSumDataStructureDesign test =  new TwoSumDataStructureDesign();
        test.add(0);
        Assert.assertFalse(test.find(0));
    }
}
