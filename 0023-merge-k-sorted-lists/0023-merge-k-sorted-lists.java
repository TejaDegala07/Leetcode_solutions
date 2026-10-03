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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> ascen=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                ascen.add(head.val);
                head=head.next;
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode mainhead=dummy;
        while(ascen.size()>0){
            ListNode adding=new ListNode(ascen.poll());
            dummy.next=adding;
            dummy=dummy.next;
        }

        return mainhead.next;
    }
}