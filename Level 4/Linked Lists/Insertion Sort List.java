/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode A) {
        ListNode prev = null, cur = A, head = new ListNode(Integer.MIN_VALUE), next = null;
        prev = head;
        ListNode temp = head;
        while(cur!=null){
            temp = head;
            next = cur.next;
            iinsert(head, cur);
            cur = next;
        }
        return head.next;
    }
        
    public static void iinsert(ListNode head, ListNode in){
        ListNode temp = head, prev = null;
        while(temp!=null){
            if(temp.val>in.val){
                 prev.next = in;
                 in.next = temp;
                 return;
            }
            prev = temp;
            temp = temp.next;
        }
        prev.next = in;
        in.next = null;
        return ;
    }
}
