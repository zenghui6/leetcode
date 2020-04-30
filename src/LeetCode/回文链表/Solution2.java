package LeetCode.回文链表;

/**
 * 翻转链表,
 * 不知道哪里错了
 * @author zeng
 */
public class Solution2 {
    public class ListNode {
        int val;
       ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean isPalindrome(ListNode head) {

        ListNode newHead = reverse(head);
        while (newHead != null){
            if (newHead.val != head.val){
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;


        while (curr != null){
            //后面一个节点,临时存储
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
