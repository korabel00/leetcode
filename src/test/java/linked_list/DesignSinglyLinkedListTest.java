package linked_list;

import linked_list.DesignSinglyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class DesignSinglyLinkedListTest {

    @Test
    public void testMyLinkedListCaseOne() {
        DesignSinglyLinkedList myLinkedList = new DesignSinglyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);                          // linked list becomes 1->2->3
        Assert.assertEquals(2,myLinkedList.get(1));               // return 2
        myLinkedList.deleteAtIndex(1);                                    // now the linked list is 1->3
        Assert.assertEquals(3, myLinkedList.get(1));              // return 3
    }

    @Test
    public void testMyLinkedListCaseTwo() {
        DesignSinglyLinkedList myLinkedList = new DesignSinglyLinkedList();
        myLinkedList.addAtTail(1);
        Assert.assertEquals(1, myLinkedList.get(0));
    }
}
