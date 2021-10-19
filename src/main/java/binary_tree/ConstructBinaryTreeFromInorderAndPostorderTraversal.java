package binary_tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
 * Output: [3,9,20,null,null,15,7]
 * Example 2:
 *
 * Input: inorder = [-1], postorder = [-1]
 * Output: [-1]
 *
 *
 * Constraints:
 *
 * 1 <= inorder.length <= 3000
 * postorder.length == inorder.length
 * -3000 <= inorder[i], postorder[i] <= 3000
 * inorder and postorder consist of unique values.
 * Each value of postorder also appears in inorder.
 * inorder is guaranteed to be the inorder traversal of the tree.
 * postorder is guaranteed to be the postorder traversal of the tree.
 */

// Time O(N) Space O(N)
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        // We need to put an array into map because it is not sorted therefore we cannot use binary search
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        // Finding this root element in the inorder array so that we can define left subTree and right subTree
        // for the inorder = [9,3,15,20,7] there are going to be two parts 9 and 15,20,7
        return helper(inorder, 0, inorder.length - 1, postorder, 0,postorder.length - 1, map);
    }

    private TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd,
                            Map<Integer,Integer> map) {

        if (inStart > inEnd || postEnd < 0) return null;

        // Creating a new tree and finding the root of it. It should be the last element in the postorder array
        // For the postorder = [9,15,7,20,3] it is going to be 3
        TreeNode root = new TreeNode();
        root.val = postorder[postEnd];
        int rootIndex = map.get(root.val);
        int leftLen = rootIndex - 1 - inStart;
        int rightLen = inEnd - (rootIndex + 1);
        root.left = helper(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftLen, map);
        root.right = helper(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightLen - 1 , postEnd - 1, map);
        return root;
    }
}
