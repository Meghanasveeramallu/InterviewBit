public class Solution {
    public int solve(ArrayList<Integer> A) {
        int req=1;
        for(int i=0; i<A.size(); i++){
            req = req*2;    
            req %= 1000000007; 
        }
        return req-1;
    }
}
