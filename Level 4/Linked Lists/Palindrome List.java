/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ListNode next=null;
        ListNode curr=A;
        ListNode prev=null;
        ListNode A1=A;
        int n=0;
        while(A1!=null)
        {
            n++;
            A1=A1.next;
        }
        int mid=n/2;
        while(mid!=0)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            mid--;
        }
        if(n%2!=0)
            curr=curr.next;
        while(curr!=null)
        {
            if(prev.val!=curr.val)
                return 0;
            curr=curr.next;
            prev=prev.next;
        }
        return 1;
    }
}
