package LeetCode.反转链表;

class Solution2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        //1.第一个条件是判断递归开始，传入的参数的合法性。第二个是递归的终止条件
        if(head == null || head.next ==null) return head;
        //2.开始进行递归
        ListNode newHead = reverseList(head.next);
        //3.尾部4-5-null中，head=4,head.next=4-5 head.next.next=4-5-null,也就是5的后继指向4
        head.next.next = head;
        //4.断开之前4-5之间的连接，将4的后继指向null
        head.next = null;
        //5.返回已经反转的链表
        return newHead;
    }
}