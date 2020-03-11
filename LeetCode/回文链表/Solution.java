package LeetCode.回文链表;

import java.util.Stack;

/**
 * @author zeng
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean isPalindrome(ListNode head) {

        Stack<ListNode> stack = new Stack<>();

        ListNode temp = head;

        boolean flag = true;
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        //此时head指向尾null

        while (!stack.isEmpty()){
            if (stack.pop()!= temp){
                flag =false;
            }
            temp = temp.next;
        }
        return flag;
    }
}
