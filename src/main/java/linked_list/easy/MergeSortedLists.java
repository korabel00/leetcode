package linked_list.easy;

//Amazon
//Facebook
//Microsoft
//Runtime - O(N + M), Space - O(1)
public class MergeSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(); //пустой лист и указатель, который будет двигаться
        ListNode head = dummyNode; //указатель на начало пустого листа который не будет двигаться

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                dummyNode.next = l1;
                l1 = l1.next;
            } else {
                dummyNode.next = l2;
                l2 = l2.next;
            }
            dummyNode = dummyNode.next;
        }

        // когда какой из листов закончился то просто добавляем все значения из второго
        if (l1 != null) {
            dummyNode.next = l1;
        } else {
            dummyNode.next = l2;
        }
        return head.next;
    }
}


