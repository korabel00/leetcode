package linked_list.easy;

import org.junit.Test;

public class RemoveLinkedListElementsTest {

    @Test
    public void removeLinkedListElementsTestCaseOne() {

        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(6,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5,
                        new ListNode(6
                                )))))));

        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        removeLinkedListElements.removeElements(head, 6);
    }
}
