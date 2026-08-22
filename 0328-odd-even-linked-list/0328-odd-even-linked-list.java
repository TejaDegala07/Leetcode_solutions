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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dum=new ListNode(-1);
        ListNode dumm=dum;

        ListNode temp=head;
        ListNode prev=head;
        while(temp!=null && temp.next!=null){
            ListNode odd=temp.next;
            
            dumm.next=odd;
            dumm=dumm.next;

            temp=temp.next.next;
            prev.next=temp;
            if(temp != null)
                prev = temp;
        }
        dumm.next=null;
        prev.next=dum.next;
        return head;
    }
}