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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        int cnt=0;
        ListNode dummy=head;
        while(dummy!=null){
            cnt++;
            dummy=dummy.next;
        }
        int target=(cnt+1)/2;
        dummy=head;
        while(target>1){
            dummy=dummy.next;
            target--;
        }   
        ListNode ln=dummy.next;
        dummy.next=null;
        ln=reverseList(ln);
        dummy=head;
        while(dummy!=null && ln!=null){
            ListNode temp = ln.next;
            ln.next = dummy.next;
            dummy.next = ln;
            dummy = ln.next;
            ln = temp;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode frnt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=frnt;
        }
        return prev;
    }
}