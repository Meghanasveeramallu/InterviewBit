public class Solution {
    public int isPower(int A) {
        int n = A;
        int p = 0;
        if(A == 1) return 1;
        for(int a=2; a<= Math.sqrt(n); a++)
        {
            p = (int)(Math.log(n) / Math.log(a));
           if(Math.pow(a,p) == A)
            return 1;
        }
        return 0;
    }
}
