* public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int firstLength = findLength(headA);
        int secondLength = findLength(headB);
        int difference = Math.abs(firstLength - secondLength);
        ListNode temp1 = headA, temp2 = headB;
        if(firstLength > secondLength) {
            while(difference-- > 0) {
                temp1 = temp1.next;
            }
        } else {
             while(difference-- > 0) {
                temp2 = temp2.next;
            }
        }
        
        while(temp1 != null && temp2 != null && temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return temp1;
    }
    
    public int findLength(ListNode head) {
        int length = 0;
        while(head != null) {
            length += 1;
            head = head.next;
        }
        return length;
    }
}
