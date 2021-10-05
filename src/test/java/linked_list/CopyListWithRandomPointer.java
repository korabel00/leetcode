package linked_list;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        Map<Node,Node> copyMap = new HashMap<>();
        // для случая когда curr = null
        copyMap.put(null, null);

        Node curr = head;

        // в первый проход просто копируем ноды
        // мы не можем проставить пойнтеры на те ноды которые еще не существуют поэтому приходится делать так
        while (curr != null) {
            Node copyNode = new Node(0);
            copyNode.val = curr.val;
            copyMap.put(curr, copyNode);
            curr = curr.next;
        }

        //во второй проход проставляем пойнтеры
        curr = head;
        while (curr != null) {
            Node copyNode = copyMap.get(curr);
            copyNode.next = copyMap.get(curr.next);
            copyNode.random = copyMap.get(curr.random);
            curr = curr.next;
        }
        return copyMap.get(head);
    }
}
