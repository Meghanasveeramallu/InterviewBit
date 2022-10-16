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
    public int maxDepth(TreeNode A) {
        List<List<Integer>> list = new ArrayList();
            if(A==null) return 0;
            Queue<TreeNode> q = new LinkedList();
            q.offer(A);
            while(!q.isEmpty()){
                int level = q.size();
                List<Integer> sublist = new ArrayList();
                for(int i=0;i<level;i++){
                    TreeNode temp = q.poll();
                    sublist.add(temp.val);
                    if(temp.left!=null) q.offer(temp.left);
                    if(temp.right!=null) q.offer(temp.right);
                }
                list.add(sublist);
            }
            return list.size();
    }
}
