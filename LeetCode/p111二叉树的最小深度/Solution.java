package LeetCode.p111二叉树的最小深度;

public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root){
        if (root == null)
            return 0;

        //叶子节点
        if ((root.left == null) && (root.right == null)){
            return  1;
        }

        int minDepth = Integer.MAX_VALUE;
        //找最小的记录下来
        if (root.left !=null ){
            minDepth = Math.min(minDepth, minDepth(root.left));
        }

        if (root.right != null){
            minDepth = Math.min(minDepth, minDepth(root.right));
        }

        return minDepth + 1;
    }
}
