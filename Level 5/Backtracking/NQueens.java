public class Solution {
	public ArrayList<ArrayList<String>> solveNQueens(int a) {
        ArrayList<ArrayList<String>> result = new ArrayList();
        if(a<1) return result;
        helper(0,a,new boolean[a], new boolean[2*a], new boolean[2*a], new ArrayList<String>(), result);
        return result;
    }
    public void helper(int r, int a, boolean[] col, boolean[] d1, boolean[] d2, ArrayList<String> list, ArrayList<ArrayList<String>> result){
        if(r==a) 
        {
            result.add(new ArrayList<String>(list));
            return;   
        }
        for(int c=0;c<a;c++){
            int id1 = c-r+a-1;
            int id2 = r+c;
            if(!col[c]&&!d1[id1]&&!d2[id2]){
                col[c] = true;
                d1[id1] = true;
                d2[id2] = true;
                char[] ch = new char[a];
                Arrays.fill(ch,'.');
                ch[c]='Q';
                list.add(new String(ch));
                helper(r+1,a,col,d1,d2,list,result);
                col[c] = false;
                d1[id1] = false;
                d2[id2] = false;
                list.remove(list.size()-1);
            }
        }
	}
}
