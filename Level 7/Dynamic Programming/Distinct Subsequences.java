public class Solution {
    public int numDistinct(String A, String B) {
        if(A.length()<B.length()) return 0;
        int m = A.length();
        int n = B.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            dp[i][0] = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(A.charAt(i)==B.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + dp[i][j+1];
                }
                else{
                    dp[i+1][j+1] = dp[i][j+1];
                }
            }
        }
        return dp[m][n];
    }
}
