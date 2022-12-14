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
    public int t2Sum(TreeNode root, int k) {
        List<Integer> list = inorderTraversal(root);
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++)
            result[i] = list.get(i);
        return twoSum(result, k)?1:0;
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
    
    public boolean twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length-1;
        int[] result = new int[2];
        while(low<high){
            if(numbers[low]+numbers[high]==target){
                return true;
            }
            else if(numbers[low]+numbers[high]>target)
                high--;
            else
                low++;
        }
        return false;
    }
}
