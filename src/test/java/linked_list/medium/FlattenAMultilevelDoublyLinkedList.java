package linked_list.medium;

import java.util.Stack;

/**
 * You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.
 * <p>
 * Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * Output: [1,2,3,7,8,11,12,9,10,4,5,6]
 * Explanation:
 * <p>
 * The multilevel linked list in the input is as follows:
 * <p>
 * <p>
 * <p>
 * After flattening the multilevel linked list it becomes:
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2,null,3]
 * Output: [1,3,2]
 * Explanation:
 * <p>
 * The input multilevel linked list is as follows:
 * <p>
 * 1---2---NULL
 * |
 * 3---NULL
 * Example 3:
 * <p>
 * Input: head = []
 * Output: []
 * <p>
 * <p>
 * How multilevel linked list is represented in test case:
 * <p>
 * We use the multilevel linked list from Example 1 above:
 * <p>
 * 1---2---3---4---5---6--NULL
 * |
 * 7---8---9---10--NULL
 * |
 * 11--12--NULL
 * The serialization of each level is as follows:
 * <p>
 * [1,2,3,4,5,6,null]
 * [7,8,9,10,null]
 * [11,12,null]
 * To serialize all levels together we will add nulls in each level to signify no node connects to the upper node of the previous level. The serialization becomes:
 * <p>
 * [1,2,3,4,5,6,null]
 * [null,null,7,8,9,10,null]
 * [null,11,12,null]
 * Merging the serialization of each level and removing trailing nulls we obtain:
 * <p>
 * [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of Nodes will not exceed 1000.
 * 1 <= Node.val <= 105
 */

public class FlattenAMultilevelDoublyLinkedList {

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
// Input:
//     1---2---3---4---5---6--NULL
//         |
//         7---8---9---10--NULL
//             |
//             11--12--NULL
//
// Output 1--2--7--8--11--12--9--10--3--4--5--6--null


    public Node flatten(Node head) {

        Node dummy = new Node();
        dummy.next = head;
        Stack<Node> nodeStack = new Stack<>();

        while (head != null) {
            // Если есть ответвление (ноды 2 и 8)
            if (head.child != null) {
                // И если есть продолжение листа на том же уровне, то кладем ссылку на начала этих веток в стек (ноды 3 и 9)
                if (head.next != null) {
                    nodeStack.push(head.next);
                    head.next.prev = null;
                }
                //Создаем новые связи между 2 и 7 и также 8 и 11
                head.next = head.child;
                head.child.prev = head;
                head.child = null;
            }
            // Если мы уперлись в null и стак отрезанных нод не пустой то добавляем их в конец того что есть сейчас
            if (head.next == null && !nodeStack.isEmpty()) {
                Node nextNode = nodeStack.pop();
                head.next = nextNode;
                nextNode.prev = head;
            }
            // Во всех прочих случаях просто двигаемся вперед по текущей ветке
            head = head.next;
        }
        return dummy.next;
    }
}


