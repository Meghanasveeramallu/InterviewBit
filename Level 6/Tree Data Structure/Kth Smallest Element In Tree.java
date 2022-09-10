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
    public int kthsmallest(TreeNode A, int B) {
    List<Integer> list = inorderTraversal(A);
        return list.get(B-1);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack();
        boolean done = false;
        TreeNode cur = root;
        while(!done){
            if(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                if(stack.isEmpty())
                    done = true;
                else{
                    cur = stack.pop();
                    list.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return list;
    }
}
