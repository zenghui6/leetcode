package LeetCode.p21合并两个有序链表;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    //递归实现
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    //迭代实现
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode prev = dummyHead;
        while (l1 != null && l2 != null){
            //从小的开始
            if (l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }

            prev = prev.next;
        }

        //因为是两个有序链表, 一条链表跑完了,将另一条剩下的接在后面
        prev.next = l1 == null ? l2 : l1;

        return dummyHead.next;
    }

}