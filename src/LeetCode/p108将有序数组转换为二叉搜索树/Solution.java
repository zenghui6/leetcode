package LeetCode.p108将有序数组转换为二叉搜索树;

/**
 * 总是用中间节点做根节点
 */
public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private TreeNode helper(int[] nums, int l , int r){
        if (l > r)
            return null;
        //位运算的优先级低
        int m = l + ((r - l) >> 1);
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(nums,l,m-1);
        root.right = helper(nums,m+1,r);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return nums==null ? null : helper(nums,0,nums.length-1);
    }
}
