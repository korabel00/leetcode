package binary_tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 * Example 2:
 *
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 *
 *
 * Constraints:
 *
 * 1 <= preorder.length <= 3000
 * inorder.length == preorder.length
 * -3000 <= preorder[i], inorder[i] <= 3000
 * preorder and inorder consist of unique values.
 * Each value of inorder also appears in preorder.
 * preorder is guaranteed to be the preorder traversal of the tree.
 * inorder is guaranteed to be the inorder traversal of the tree.
 */

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, 0, inorder.length - 1, preorder, inorder, map);
    }

    public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder, Map<Integer, Integer> map) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = map.get(preorder[preStart]); // Index of current root in inorder
        root.left = helper(preStart + 1, inStart, rootIndex - 1, preorder, inorder, map);
        root.right = helper(preStart + (rootIndex - inStart) + 1, rootIndex + 1, inEnd, preorder, inorder, map);
        return root;
    }
}
