package linked_list.medium;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * Example 2:
 * <p>
 * Input: head = [1], n = 1
 * Output: []
 * Example 3:
 * <p>
 * Input: head = [1,2], n = 1
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is sz.
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * <p>
 * <p>
 * Follow up: Could you do this in one pass?
 */

public class RemoveNthNodeFromEndOfList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Time O(N) Space O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pointerA = dummy;
        ListNode pointerB = dummy;

        for (int i = 0; i < n; i++) {
            pointerA = pointerA.next;
        }

        while (pointerA.next != null) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        pointerB.next = pointerB.next.next;
        return dummy.next;
    }
}
