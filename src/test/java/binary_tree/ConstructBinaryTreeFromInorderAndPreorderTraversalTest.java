package binary_tree;

import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeFromInorderAndPreorderTraversalTest {

    @Test
    public void ConstructBinaryTreeCaseOne() {
        ConstructBinaryTreeFromPreorderAndInorderTraversal test = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        TreeNode actual = test.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
        Assert.assertEquals(3, actual.val);
        Assert.assertEquals(9, actual.left.val);
        Assert.assertEquals(20, actual.right.val);
        Assert.assertEquals(7, actual.right.right.val);
        Assert.assertEquals(15, actual.right.left.val);
    }
}
