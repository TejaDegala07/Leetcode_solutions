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
        int la=0,lb=0;
        ListNode da=headA,db=headB;
        while(da!=null){
            la++;
            da=da.next;
        }
        while(db!=null){
            lb++;
            db=db.next;
        }
        da=headA;
        db=headB;
        if(la>lb){
            while(la>lb){
                da=da.next;
                la--;
            }
        }
        else{
            while(la<lb){
                db=db.next;
                lb--;
            }
        }

        while(da!=null && db!=null){
            if(da==db) return da;
            da=da.next;
            db=db.next;
        }

        return null;
    }
}