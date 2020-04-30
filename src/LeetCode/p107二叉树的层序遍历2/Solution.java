package LeetCode.p107二叉树的层序遍历2;

import java.util.ArrayList;
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ret = new LinkedList<>();
        if (root == null)
            return ret;
        //层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> oneLevel = new ArrayList<>();
            //每次都取出一层的所以数据
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                oneLevel.add(node.val);

                if (node.left!=null)
                    queue.add(node.left);
                if (node.right!=null)
                    queue.add(node.right);
            }
            //将这一排的塞进链表头
            ret.addFirst(oneLevel);
        }
        return ret;
    }
}
