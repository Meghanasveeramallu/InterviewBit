public class Solution {
    public int gcd(int A, int B) {
        if(B == 0) return A;
        if(A == 1 && B == 1) return 1;
        return gcd(B, A % B);
    }
}
