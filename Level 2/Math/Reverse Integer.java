public class Solution {
    public int reverse(int A) {
        boolean negative = A < 0;
        A = Math.abs(A);
        long ans = 0;
        while(A != 0){
            ans = ans*10 + A%10;
            A = A/10;
        }
        if(ans > Integer.MAX_VALUE) return 0;
        if(negative) return -(int) ans;
        return (int)ans;
    }
}
