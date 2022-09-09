public class Solution {
    public int solve(String A) {
        int sz=A.length();
        if(sz==1) return 0;
        int v=0,c=0;
        for(int i=0;i<sz;i++){
            if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u') v++;
            else c++;
        }
        int answer = v*c % 1000000007;
        return answer;
    }
}
