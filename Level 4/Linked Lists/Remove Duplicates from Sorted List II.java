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
        ListNode start = new ListNode(0);
        start.next = A;
        ListNode previous = start;
        ListNode current = A;
        while(current != null) { 
                if(current.next != null && current.val == current.next.val) { 
                while(current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                previous.next = current.next;
            } else { 
                previous = previous.next;
            }
            current = current.next; 
        }
        return start.next;
    }
}
