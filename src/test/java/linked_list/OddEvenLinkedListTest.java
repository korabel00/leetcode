package linked_list;

import linked_list.ListNode;
import linked_list.OddEvenLinkedList;
import org.junit.Test;
import org.testng.Assert;

public class OddEvenLinkedListTest {

    @Test
    public void oddEvenLinkedListTestCaseOne() {
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5)))));

        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        oddEvenLinkedList.oddEvenList(head);
        Assert.assertEquals(head.val, 1);
        Assert.assertEquals(head.next.val, 3);
        Assert.assertEquals(head.next.next.val, 5);
        Assert.assertEquals(head.next.next.next.val, 2);
        Assert.assertEquals(head.next.next.next.next.val, 4);
        Assert.assertNull(head.next.next.next.next.next);
    }
}
