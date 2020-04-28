package LeetCode.p110平衡二叉树;

public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //计算当前节点的高度
    private int height(TreeNode root){
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left),height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        //高度差 < 2 , 且每个子树都为平衡二叉树 为平衡二叉树
        return Math.abs( height(root.left) - height(root.right)) < 2
                && isBalanced(root.left) && isBalanced(root.right);
    }
}
