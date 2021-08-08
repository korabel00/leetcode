package linked_list.medium;

import org.junit.Test;

import static linked_list.medium.RemoveNthNodeFromEndOfList.*;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthNodeFromEndOfListTestCaseOne() {

        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;


        RemoveNthNodeFromEndOfList nthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        nthNodeFromEndOfList.removeNthFromEnd(head, 2);
    }

    @Test
    public void removeNthNodeFromEndOfListTestCaseTwo() {

        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        head.next = secondNode;

        RemoveNthNodeFromEndOfList nthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        nthNodeFromEndOfList.removeNthFromEnd(head, 2);
    }
}
