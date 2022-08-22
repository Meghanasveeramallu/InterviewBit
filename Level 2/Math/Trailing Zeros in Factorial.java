public class Solution {
    public int trailingZeroes(int A) {
        int n=0;
        while(A>=5){
            A=A/5;
            n+=A;
        }
        return n;
    }
}
