/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A==null || A.next==null) return A;
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode cur = dummy;
        while(cur.next!=null&&cur.next.next!=null){
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            first.next = second.next;
            cur.next = second;
            second.next = first;
            cur = first;
        }
        return dummy.next;
    }
}
