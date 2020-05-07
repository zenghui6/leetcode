package LeetCode.p112路径总和;

public class Solution {
    class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;

        sum -= root.val;
        //叶子节点
        if (root.left == null && root.right == null)
            return sum == 0;

        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);

    }
}
