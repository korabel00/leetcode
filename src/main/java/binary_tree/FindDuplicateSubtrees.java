package binary_tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Given the root of a binary tree, return all duplicate subtrees.
 *
 * For each kind of duplicate subtrees, you only need to return the root node of any one of them.
 *
 * Two trees are duplicate if they have the same structure with the same node values.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,3,4,null,2,4,null,null,4]
 * Output: [[2,4],[4]]
 * Example 2:
 *
 *
 * Input: root = [2,1,1]
 * Output: [[1]]
 * Example 3:
 *
 *
 * Input: root = [2,2,2,3,null,3,null]
 * Output: [[2,3],[3]]
 *
 *
 * Constraints:
 *
 * The number of the nodes in the tree will be in the range [1, 10^4]
 * -200 <= Node.val <= 200
 */

// Time = O(N*N) N - for traversing tree, N - for hashing string
// Space = O(N + N)
public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode> list = new LinkedList<>();
        helper(root, map, list);
        return list;
    }

    private String helper(TreeNode root, Map<String, Integer> map, List<TreeNode> list) {
        if(root == null) return "#";

        String key = helper(root.left, map, list) + "#" +
                helper(root.right, map, list) + "#" +
                root.val;

        map.put(key, map.getOrDefault(key, 0) + 1);
        if(map.get(key) == 2) list.add(root);

        return key;
    }
}
