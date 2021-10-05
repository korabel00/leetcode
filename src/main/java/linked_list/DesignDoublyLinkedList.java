package linked_list;

/**
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 * A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
 *
 * Implement the MyLinkedList class:
 *
 * MyLinkedList() Initializes the MyLinkedList object.
 * int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
 * void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
 * void addAtTail(int val) Append a node of value val as the last element of the linked list.
 * void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
 * void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 *
 *
 * Example 1:
 *
 * Input
 * ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
 * [[], [1], [3], [1, 2], [1], [1], [1]]
 * Output
 * [null, null, null, null, 2, null, 3]
 *
 * Explanation
 * MyLinkedList myLinkedList = new MyLinkedList();
 * myLinkedList.addAtHead(1);
 * myLinkedList.addAtTail(3);
 * myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
 * myLinkedList.get(1);              // return 2
 * myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
 * myLinkedList.get(1);              // return 3
 *
 *
 * Constraints:
 *
 * 0 <= index, val <= 1000
 * Please do not use the built-in LinkedList library.
 * At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex and deleteAtIndex.
 */

//medium
public class DesignDoublyLinkedList {

    // здесь записана структура ноды
    static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }

    private Node head; // отслеживаем начало списка
    private int size; // отслеживаем размер списка

    /** Initialize your data structure here. */
    // There is no need for creation an empty constructor because it will be created automatically
    // by default by JVM

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        //если индекс некорректный возвращаем -1
        if (index >= size) return -1;
        if (head == null) {
            return -1;
        }
        // в противном случае идем с начала списка отсчитывая кол-во пройденных нод
        Node curr = head;
        // i < index потому что head уже содержит 1 ноду
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        // Сохраняем текущую ссылку на первую ноду, записываем в head новую первую ноду и в этой новой ноде
        // ставим ссылку на старый head
        Node temp = head;
        head = new Node(val);
        head.next = temp;
        head.prev = null;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        // если head пустой то просто присваиваем значение
        if (head == null) {
            head = new Node(val);
        } else {
            // идем с начала списка и отслеживаем существует ли ссылка на следующую ноду. Если нет -
            // пишем новую ссылку на новую ноду
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(val);
            curr.next.prev = curr;
        }
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list,
     * the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

        //проверяем пограничные кейсы и если это не они ищем индекс, ставим ссылку в новой ноде на
        // следующую за текущей а в текущей ссылаемся на новую ноду
        Node curr = head;
        if (index > size) return;
        if (index == 0) addAtHead(val);
        else if (index == size) addAtTail(val);
        else {
            Node newNode = new Node(val);
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            newNode.next  = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= size) return;
        if (index == 0) head = head.next;
        else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            if (curr.next.next == null) {
                curr.next = null;
            } else {
                curr.next = curr.next.next;
                // не используем curr.next.next.prev потому что ссылка была изменена
                curr.next.prev = curr;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
