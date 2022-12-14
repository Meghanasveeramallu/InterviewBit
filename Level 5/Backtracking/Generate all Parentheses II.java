public class Solution {
    public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> list = new ArrayList();
        helper(list, "", A, 0, 0);
        return list;
    }
    
    public void helper(ArrayList<String> list, String s, int n, int l, int h){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        if(l<n) helper(list,s+"(",n,l+1,h);
        if(h<l) helper(list,s+")",n,l,h+1);
    }
}
