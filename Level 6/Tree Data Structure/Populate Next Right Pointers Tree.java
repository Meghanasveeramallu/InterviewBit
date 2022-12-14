/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null) return;
        Queue<TreeLinkNode> q = new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            TreeLinkNode prev = null;
            for(int i=0;i<level;i++){
                TreeLinkNode temp = q.poll();
                if(prev!=null) prev.next = temp;
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                prev = temp;
            }
        }
    }
}
