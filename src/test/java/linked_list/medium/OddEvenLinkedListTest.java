package linked_list.medium;

import linked_list.easy.ListNode;
import org.junit.Test;

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
    }
}
