public class Solution {
    public long solve(int A, int B) {
        long a=A,b=B;
        long lcm;
        lcm = (a*b)/g(A,B);
        return lcm;
    }
    public long g(int A,int B){
        if (A==0){
            return B;
        }
        return g(B%A,A);
    }
}
