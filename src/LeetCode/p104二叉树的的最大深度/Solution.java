package LeetCode.p104二叉树的的最大深度;

public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode root) {
      if (root == null)
          return 0;

      //左右子树的最大深度
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        //取大值后加一
        return Math.max(left,right) +1;
    }
}
