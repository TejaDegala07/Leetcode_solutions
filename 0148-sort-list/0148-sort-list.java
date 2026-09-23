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
    // iddharini kalipeyyatam 
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                dummy.next=list1;
                list1=list1.next;
            }
            else if(list1.val>list2.val){
                dummy.next=list2;
                list2=list2.next;
            }
            if(dummy.next!=null)dummy=dummy.next;
        }
        if(list1!=null) dummy.next=list1;
        else if(list2!=null)dummy.next=list2;

        return ans.next;
        
    }
    // finding middle monkey gaadu 
    ListNode middle(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    // mergesort brooh 
    ListNode mergesort(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode mid=middle(head);
        ListNode righthead=mid.next;
        mid.next=null;

        ListNode left=mergesort(head);
        ListNode right=mergesort(righthead);

        return merge(left,right);
    }

    // main method guru
    public ListNode sortList(ListNode head) {
        return mergesort(head);
    }
}