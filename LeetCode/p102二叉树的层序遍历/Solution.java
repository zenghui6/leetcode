package LeetCode.p102二叉树的层序遍历;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> ret = new LinkedList<>();
        if (root == null)
            return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer> oneLevel = new LinkedList<>();
            //当前队列的元素就是这一排的
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                oneLevel.add(curNode.val);
                if (curNode.left!=null)
                    queue.add(curNode.left);
                if (curNode.right!=null)
                    queue.add(curNode.right);
            }

            //加入ret 链表尾部
            ret.addLast(oneLevel);
        }
        return ret;
    }
}
