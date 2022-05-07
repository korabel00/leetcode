package linked_list;

import amazon.AddTwoNumbers;
import org.junit.Test;
import org.testng.Assert;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbersCaseOne() {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l3 = addTwoNumbers.addTwoNumbers(l1, l2);

        Assert.assertEquals(l3.val, 7);
        Assert.assertEquals(l3.next.val, 0);
        Assert.assertEquals(l3.next.next.val, 8);
    }
}
