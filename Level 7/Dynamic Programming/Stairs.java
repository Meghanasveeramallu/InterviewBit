public class Solution {
    public int climbStairs(int A) {
        if(A<=0) return 0;
        if(A==1) return 1;
        if(A==2) return 2;
        int c=1,d=2,result=0;
        for(int i=2;i<A;i++){
            result = c+d;
            c=d;
            d=result;
        }
        return result;
    }
}
