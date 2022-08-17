public class Solution {
    public int solve(int A, int B, int C) {
        int ans = (C + A - 1) % B;
        
        if(ans == 0) return B;
        return ans;
    }
}
