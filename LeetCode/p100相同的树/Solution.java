package LeetCode.p100相同的树;

public class Solution {
    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //都为空，显然相同
        if (p == null && q==null) return true;
        // 一个为空， 一个不为空，显然不同
        if (p == null  || q==null) return false;
        //两个都不为空，但是值不同
        if (p.val != q.val) return false;

        //两个都不为空，且值相同，继续递归
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
