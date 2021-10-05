package linked_list;

import linked_list.ListNode;

/**
 * Given the head of a linked list, rotate the list to the right by k places.
 *
 * *
 * Example 1:
 *
 *
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]
 * Example 2:
 *
 *
 * Input: head = [0,1,2], k = 4
 * Output: [2,0,1]
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 500].
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 109
 */

// Time O(N) Space O(1)
//medium
public class RotateList {

    // smarter than brute force
    public ListNode rotateRightSmart(ListNode head, int k) {

        if (head == null) return null;

        int length = 1;
        ListNode curr = head;

        // find the length
        while (curr.next != null) {
            length++;
            curr = curr.next;
        }
        // store the end of the list
        ListNode end = curr;

        // find number of rotation in both cases when k < length and when k > length
        k = k % length;

        // in case number of rotation multiply equals to length, for example k=8 and l=2
        if (k == 0) return head;

        // find cutting place
        curr = head;
        for (int i = 0; i < length - k - 1; i++) {
            curr = curr.next;
        }

        // link the end of the list to start of the list
        end.next = head;
        // update the head
        head = curr.next;
        // cut the link of the new last Node
        curr.next = null;

        return head;
    }

    //brute force
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) return null;

        //count length for edge case when length = 2 or 1
        ListNode curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        if (length == 1) return head;

        if (length == 2) {
            if (k % 2 == 0) return head;
            else {
                head.next.next = head;
                ListNode newHead = head.next;
                head.next = null;
                return newHead;
            }
        }

        if (k % length != 0) {
            // main script
            for (int i = 0; i < k; i++) {
                curr = head;
                while (curr.next.next != null) {
                    curr = curr.next;
                }
                curr.next.next = head;
                head = curr.next;
                curr.next = null;
            }
        }
        return head;
    }

}
