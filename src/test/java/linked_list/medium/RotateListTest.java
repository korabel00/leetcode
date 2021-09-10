package linked_list.medium;

import linked_list.easy.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RotateListTest {

    @Test
    public void testRotateListCaseOne() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        RotateList rotateList = new RotateList();
        ListNode expectedListNode = rotateList.rotateRightSmart(listNode, 2);
        Assert.assertEquals(4, expectedListNode.val);
        Assert.assertEquals(5, expectedListNode.next.val);
        Assert.assertEquals(1, expectedListNode.next.next.val);
        Assert.assertEquals(2, expectedListNode.next.next.next.val);
        Assert.assertEquals(3, expectedListNode.next.next.next.next.val);
    }

    @Test
    public void testRotateListCaseTwo() {
        ListNode listNode = new ListNode(0, new ListNode(1, new ListNode(2)));
        RotateList rotateList = new RotateList();
        ListNode expectedListNode = rotateList.rotateRightSmart(listNode, 4);
        Assert.assertEquals(2, expectedListNode.val);
        Assert.assertEquals(0, expectedListNode.next.val);
        Assert.assertEquals(1, expectedListNode.next.next.val);
    }
}


