/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        int carry =0, sum=0;
        ListNode dummy = new ListNode(0);
        ListNode iter = dummy;
        while(A!=null || B!=null || carry!=0){
            int a = (A==null)?0:A.val;
            int b = (B==null)?0:B.val;
            sum = (a+b+carry)%10;
            carry = (a+b+carry)/10;
            iter.next = new ListNode(sum);
            A = (A==null)?A:A.next;
            B = (B==null)?B:B.next;
            iter = iter.next;
        }
        return dummy.next;
    }  
}
