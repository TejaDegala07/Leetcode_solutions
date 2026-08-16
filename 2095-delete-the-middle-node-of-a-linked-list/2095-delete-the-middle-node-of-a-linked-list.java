/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr=head;
        ListNode frnt=head;
       
        while(frnt!=null && frnt.next!=null){
            prev=curr;
            curr=curr.next;
            frnt=frnt.next.next;
        }
        prev.next=curr.next;
        return head;

    }
}