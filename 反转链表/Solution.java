package 反转链表;

/**
 * @author zeng
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        //前节点
        ListNode prev = null;
        //当前节点
        ListNode curr = head;
        while (curr != null){
            //后一个节点,用于临时储存
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
