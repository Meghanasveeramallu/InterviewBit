public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int row=A.size(), col=A.get(0).size();
        int maxSum=Integer.MIN_VALUE;
        int dp[][]=new int[row+1][col+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=A.get(i-1).get(j-1)+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
            }
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int sum=Integer.MIN_VALUE;
                if(i-B>=0 && j-B>=0){
                    sum=dp[i][j]-dp[i-B][j]-dp[i][j-B]+dp[i-B][j-B];
                    maxSum=Math.max(maxSum,sum);
                }
            }
        }
        return maxSum;
    }
}
