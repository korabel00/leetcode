package linked_list;

import linked_list.ListNode;
import linked_list.PalindromeLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLinkedListTest {

    @Test
    public void palindromeLinkedListTestCaseOne() {

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean expected = palindromeLinkedList.isPalindrome(head);
        Assert.assertFalse(expected);
    }

    @Test
    public void palindromeLinkedListTestCaseTwo() {

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(1))));

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean expected = palindromeLinkedList.isPalindrome(head);
        Assert.assertTrue(expected);
    }
}
