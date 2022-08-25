public class Solution {
    public Long solve(int A, int B) {
        return (get(B) - get(A-1)); 
    }
    public long get(int x){
        long n =  (x/7);
        long ans = 7*(n*(n+1))/2;
        return ans;
    }
}
