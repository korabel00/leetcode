package linked_list;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 * Example 2:
 *
 * Input: head = [], val = 1
 * Output: []
 * Example 3:
 *
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 104].
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 */

// easy
public class RemoveLinkedListElements {

    //Time O(N) Space
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
                curr = prev;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    //Time O(N) Space
    // Approach without using dummy head
    public ListNode removeElements2(ListNode head, int val) {

        // solving the problem when val is in the head instead of using dummy
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
