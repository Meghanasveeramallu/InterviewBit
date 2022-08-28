/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        if(A == null || A.next == null) return A;
        ListNode curr = A;
        ListNode prev = A;
        ListNode head = prev; 
        while(curr!=null){
            while(curr!=null && curr.val == prev.val)
                curr = curr.next;
            prev.next = curr;
            prev = curr;
        }
      return head;
    }
}
