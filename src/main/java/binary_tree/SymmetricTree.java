package binary_tree;

public class SymmetricTree {

    // Time O(N) Space O(height of the tree)
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftSubTree, TreeNode rightSubTree) {
        if (leftSubTree == null && rightSubTree == null) return true;
        else if(leftSubTree != null && rightSubTree != null)  {
            return leftSubTree.val == rightSubTree.val &&
                    isMirror(leftSubTree.left, rightSubTree.right) &&
                    isMirror(leftSubTree.right, rightSubTree.left);
        }
        else return false;
    }
}
