/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        int[] inorder = new int[A.size()];
	    for(int i=0;i<inorder.length;i++)
	    inorder[i] = A.get(i);
	    int[] postorder = new int[B.size()];
	    for(int i=0;i<postorder.length;i++)
	    postorder[i] = B.get(i);
	    return helper(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
    
    public TreeNode helper(int[] postorder, int poststart, int postend, int[] inorder, int instart, int inend)
    {
        if(poststart>postend||instart>inend) return null;
        int data = postorder[postend];
        TreeNode curr = new TreeNode(data);
        int offset = instart;
        for(;offset<inend;offset++) { if(inorder[offset]==data) break; }
        curr.left = helper(postorder,poststart,poststart+offset-instart-1,inorder,instart,offset-1);
        curr.right = helper(postorder,poststart+offset-instart,postend-1,inorder,offset+1,inend);
        return curr;
    }
}
