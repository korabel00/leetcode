package binary_tree;

import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    @Test
    public void ConstructBinaryTreeCaseOne() {
        ConstructBinaryTreeFromInorderAndPostorderTraversal test = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        TreeNode actual = test.buildTree(new int[] {9,3,15,20,7}, new int[] {9,15,7,20,3});
        Assert.assertEquals(3, actual.val);
        Assert.assertEquals(9, actual.left.val);
        Assert.assertEquals(20, actual.right.val);
        Assert.assertEquals(7, actual.right.right.val);
        Assert.assertEquals(15, actual.right.left.val);
    }
}
