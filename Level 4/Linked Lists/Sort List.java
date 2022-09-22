/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        ListNode current=A;
        while(current!=null){
            p.add(current.val);
            current=current.next;
        }
        ListNode temp= new ListNode(p.poll());
        A=temp;
        while(p.isEmpty()==false){
            ListNode pre = new ListNode(p.poll());
            temp.next=pre;
            temp=temp.next;
        }
        return A;
    }
}
