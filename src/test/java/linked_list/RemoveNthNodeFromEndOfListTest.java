package linked_list;

import amazon.RemoveNthNodeFromEndOfList;
import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthNodeFromEndOfListTestCaseOne() {

        RemoveNthNodeFromEndOfList.ListNode head = new RemoveNthNodeFromEndOfList.ListNode(1);
        RemoveNthNodeFromEndOfList.ListNode secondNode = new RemoveNthNodeFromEndOfList.ListNode(2);
        RemoveNthNodeFromEndOfList.ListNode thirdNode = new RemoveNthNodeFromEndOfList.ListNode(3);
        RemoveNthNodeFromEndOfList.ListNode fourthNode = new RemoveNthNodeFromEndOfList.ListNode(4);
        RemoveNthNodeFromEndOfList.ListNode fifthNode = new RemoveNthNodeFromEndOfList.ListNode(5);
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;


        RemoveNthNodeFromEndOfList nthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        nthNodeFromEndOfList.removeNthFromEnd(head, 2);
    }

    @Test
    public void removeNthNodeFromEndOfListTestCaseTwo() {

        RemoveNthNodeFromEndOfList.ListNode head = new RemoveNthNodeFromEndOfList.ListNode(1);
        RemoveNthNodeFromEndOfList.ListNode secondNode = new RemoveNthNodeFromEndOfList.ListNode(2);
        head.next = secondNode;

        RemoveNthNodeFromEndOfList nthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        nthNodeFromEndOfList.removeNthFromEnd(head, 2);
    }
}
