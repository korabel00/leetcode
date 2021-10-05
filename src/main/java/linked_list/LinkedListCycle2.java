package linked_list;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * <p>
 * Notice that you should not modify the linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2], pos = 0
 * Output: tail connects to node index 0
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 * Example 3:
 * <p>
 * <p>
 * Input: head = [1], pos = -1
 * Output: no cycle
 * Explanation: There is no cycle in the linked list.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the list is in the range [0, 104].
 * -105 <= Node.val <= 105
 * pos is -1 or a valid index in the linked-list.
 * <p>
 * <p>
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */

//medium
public class LinkedListCycle2 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //If there is no cycle, the fast pointer will stop at the end of the linked list.
    //If there is a cycle, the fast pointer will eventually meet with the slow pointer.

    // Time O(N) Space O(1)
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                // start over but now fast goes only by ONE step at a time
                // they are gonna meet each other in exactly the place where the cycle has started
                // when the fast pointer will be at the start point of cycle slow pointer will be there as well
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
