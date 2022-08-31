public class Solution {
    public int solve(ArrayList<Integer> A) {
        int count  = 0;
        HashSet<Integer> socks = new HashSet<Integer>();
        for(int i=0;i<A.size();i++) {
            if(socks.contains(A.get(i))){
                count++;
                socks.remove(A.get(i));
            }
            else socks.add(A.get(i));
        }
        return count;
    }
}
