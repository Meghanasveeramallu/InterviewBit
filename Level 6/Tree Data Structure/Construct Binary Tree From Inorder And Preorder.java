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
        int[] preorder = new int[A.size()];
	    for(int i=0;i<preorder.length;i++)
	    preorder[i] = A.get(i);
        int[] inorder = new int[B.size()];
	    for(int i=0;i<inorder.length;i++)
	    inorder[i] = B.get(i);
        return helper(preorder,0,preorder.length-1, inorder, 0, inorder.length-1);
    }
    
    public TreeNode helper(int[] preorder, int ps, int pe, int[] inorder, int is, int ie){
        if(ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(preorder[ps]);
        int offset = is;
        for(;offset<=ie;offset++){
            if(inorder[offset]==preorder[ps])
                break;
        }
        root.left = helper(preorder, ps+1,ps+offset-is,inorder, is, offset-1);
        root.right = helper(preorder, ps+offset-is+1, pe, inorder,offset+1,ie);
        return root;
    }
}
