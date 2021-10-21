package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII {

    public TreeNode connectRecursion(TreeNode root) {

        if (root == null) return null;

        if (root.left != null) {
            if (root.right != null) root.left.next = root.right;
            else  if (root.next != null) {
                if (root.next.left != null) root.left.next = root.next.left;
                else if (root.next.right != null) root.left.next = root.next.right;
            }
        }
        if (root.right != null) {
            if (root.next != null) {
                if (root.next.left != null) root.right.next = root.next.left;
                else if (root.next.right != null) root.right.next = root.next.right;
            }
        }
        connectRecursion(root.left);
        connectRecursion(root.right);
        return root;
    }

    public TreeNode connectQueue(TreeNode root) {

        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            TreeNode dummy = new TreeNode(0);
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.remove();
                dummy.next = curr;
                dummy = dummy.next;
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
        }
        return root;
    }
}
