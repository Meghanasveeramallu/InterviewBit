/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode iter = head;
        while(iter!=null){
            RandomListNode next = iter.next;
            RandomListNode newnode = new RandomListNode(iter.label);
            iter.next = newnode;
            newnode.next = next;
            iter = next;
        }
        iter = head;
        while(iter!=null){
            if(iter.random!=null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode rand = dummy;
        while(iter!=null){
            RandomListNode next = iter.next.next;
            rand.next = iter.next;
            rand = rand.next;
            iter.next = next;
            iter = next;
        }
        return dummy.next;
    }
}
