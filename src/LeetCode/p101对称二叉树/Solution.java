package LeetCode.p101对称二叉树;

public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode left,TreeNode right){
        //两个都为空， 对称
        if (left == null && right==null) return true;
        //一个为空， 一个不为空 ，不对称
        if (left == null || right == null) return false;
        //两个都不为空， 镜像不相等
        if (left.val != right.val ) return false;
        // 两个都不为空， 且镜像相等，递归
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
}
