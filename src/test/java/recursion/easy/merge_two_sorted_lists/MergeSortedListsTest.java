package recursion.easy.merge_two_sorted_lists;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import recursion.easy.merge_two_sorted_lists.ListNode;
import recursion.easy.merge_two_sorted_lists.MergeSortedLists;

/**
 * Write a SortedMerge() function that takes two lists, each of which is sorted in increasing order, and merges the two
 * together into one list which is in increasing order. SortedMerge() should return the new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * For example if the first linked list a is 5->10->15 and the other linked list b is 2->3->20,
 * then SortedMerge() should return a pointer to the head node of the merged list 2->3->5->10->15->20.
 * There are many cases to deal with: either ‘a’ or ‘b’ may be empty, during processing either ‘a’ or ‘b’ may run out first,
 * and finally, there’s the problem of starting the result list empty, and building it up while going through ‘a’ and ‘b’.
 *
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Input: l1 = [], l2 = []
 * Output: []
 * Input: l1 = [], l2 = [0]
 * Output: [0]
 *
 */

public class MergeSortedListsTest {

    private MergeSortedLists mergeSortedLists;
    private ListNode l1;
    private ListNode l2;

    @BeforeClass
    public void setUp() {
        mergeSortedLists = new MergeSortedLists();
        l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    }

    @Test
    public void getListNode() {

        ListNode actualValue = mergeSortedLists.mergeTwoLists(l1, l2);
        Assert.assertEquals(actualValue.val, 1, "Wrong answer");
        Assert.assertEquals(actualValue.next.val, 1, "Wrong answer");
        Assert.assertEquals(actualValue.next.next.val, 2, "Wrong answer");
        Assert.assertEquals(actualValue.next.next.next.val, 3, "Wrong answer");
        Assert.assertEquals(actualValue.next.next.next.next.val, 4, "Wrong answer");
        Assert.assertEquals(actualValue.next.next.next.next.next.val, 4, "Wrong answer");
        Assert.assertNull(actualValue.next.next.next.next.next.next, "Wrong answer");
    }

    @AfterClass
    public void tearDown() {
        mergeSortedLists = null;
    }

}