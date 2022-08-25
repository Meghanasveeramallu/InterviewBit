public class Solution {
    public int solve(int A) {
        int m=(int) (Math.log10(A) + 1);
        int n=A;
        int r=0, s;
        while(n>0){
            s=(int)Math.pow(n%10,m);
            r=r+s;
            n=n/10;
        }
        if (A==r) return 1;
        else return 0;
        
    }
}
