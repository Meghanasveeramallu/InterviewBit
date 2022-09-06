public class Solution {
    public int solve(int A) {
        int sum = 0;
        while (A>=10){
            int temp = A%10;
            sum = sum+temp;
            A = A/10 + temp;
        }
        return A;
    }
}
