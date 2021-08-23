package linked_list.medium;

import linked_list.easy.ListNode;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbersCaseOne() {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(l1, l2);
    }
}
