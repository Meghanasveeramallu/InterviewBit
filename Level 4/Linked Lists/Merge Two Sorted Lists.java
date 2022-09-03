/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode r=new ListNode(0);
        ListNode c=r;
        while(A!=null && B!=null){
            if (A.val>B.val){
                c.next=B;
                B=B.next;
            }
            else{
                c.next=A;
                A=A.next;
            }
            c=c.next;
        }
        if(A!=null){
            while(A!=null){
                c.next = A;
                A = A.next;
                c = c.next;
            }
        }
        if(B!=null){
            while(B!=null){
                c.next = B;
                B = B.next;
                c = c.next;
            }
        }
        return r.next;
    }
}
