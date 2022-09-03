/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        if(A == null) return null;
        if(A.next == null){
            A = null;
            return A;
        }
        ListNode temp = A;
        int len = 0;
        while(temp !=null){
            len++;
            temp = temp.next;
        }
        if(B>=len){
            A = A.next;
            return A;
        }
        temp = A;
        int i=1;
        int cut = len-B;
        while(i<cut){
            i++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return A;
    }
}
