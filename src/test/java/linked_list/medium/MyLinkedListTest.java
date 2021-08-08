package linked_list.medium;

import linked_list.medium.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void testMyLinkedListCaseOne() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);                          // linked list becomes 1->2->3
        Assert.assertEquals(2,myLinkedList.get(1));               // return 2
        myLinkedList.deleteAtIndex(1);                                    // now the linked list is 1->3
        Assert.assertEquals(3, myLinkedList.get(1));              // return 3
    }

    @Test
    public void testMyLinkedListCaseTwo() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        Assert.assertEquals(1, myLinkedList.get(0));
    }
}
