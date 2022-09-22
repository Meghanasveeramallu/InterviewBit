/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        ListNode temp=A;
        if(A==null){
            return -1;
        }
        int len=0;
        ListNode t=A;
        while(t!=null){
            len++;
            t=t.next;
        }
        int target=(len/2)-B;
        if(B>(len/2)){
            return -1;
        }
        for(int i=0;i<target;i++){
            temp=temp.next;
        }
        return temp.val; 
    }
}
