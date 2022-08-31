public class Solution {
    public int isPalindrome(int A) {
        int temp = A;
        int ans = 0;
        while(temp > 0){
            ans = temp%10 + ans*10;
            temp /= 10;
        }
        if( ans == A) return 1;
        return 0;
    }
}
