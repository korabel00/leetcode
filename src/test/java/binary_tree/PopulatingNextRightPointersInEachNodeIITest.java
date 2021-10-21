package binary_tree;

import org.junit.Test;
import org.testng.Assert;

public class PopulatingNextRightPointersInEachNodeIITest {

    @Test
    public void caseOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);
        root.right.left = null;

        PopulatingNextRightPointersInEachNodeII test = new PopulatingNextRightPointersInEachNodeII();
        test.connectRecursion(root);
        Assert.assertEquals(root.left.right.next.val, 7);

    }

    @Test
    public void caseTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = null;
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.right.left = null;

        PopulatingNextRightPointersInEachNodeII test = new PopulatingNextRightPointersInEachNodeII();
        test.connectRecursion(root);
        Assert.assertEquals(root.left.next.val, 3);
        Assert.assertEquals(root.left.left.next.val, 5);

    }

    @Test
    public void caseThree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);
        root.right.left = null;

        PopulatingNextRightPointersInEachNodeII test = new PopulatingNextRightPointersInEachNodeII();
        test.connectQueue(root);
        Assert.assertEquals(root.left.right.next.val, 7);

    }

    @Test
    public void caseFour() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = null;
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.right.left = null;

        PopulatingNextRightPointersInEachNodeII test = new PopulatingNextRightPointersInEachNodeII();
        test.connectQueue(root);
        Assert.assertEquals(root.left.next.val, 3);
        Assert.assertEquals(root.left.left.next.val, 5);

    }
}
