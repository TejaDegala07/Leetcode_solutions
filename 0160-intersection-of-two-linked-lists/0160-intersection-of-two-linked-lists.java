/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode da=headA,db=headB;
        while(da!=db){
            if(da==null) da=headB;
            else da=da.next;
            if(db==null) db=headA;
            else db=db.next;
            
        }
        return da;
    }
}