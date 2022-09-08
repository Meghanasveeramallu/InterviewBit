public class Solution {
    int mod = (int)1e9 + 7;
    public int solve(int n) {
        long res = 0;
        for(int i = 1; i <= n; i++){
            res += Integer.bitCount(i);
        }
        return (int)(res%mod);
    }
}
