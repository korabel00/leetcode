package hash_table;

import org.junit.Assert;
import org.junit.Test;

public class InsertDeleteGetRandomTest {

    @Test
    public void caseOne() {
        InsertDeleteGetRandom test = new InsertDeleteGetRandom();
        test.insert(0);
        test.insert(1);
        test.remove(0);
        test.insert(2);
        test.remove(1);
        int actual = test.getRandom();
        Assert.assertEquals(2, actual );
    }
}
