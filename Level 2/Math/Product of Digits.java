public class Solution {
    public int solve(int A) {
        String a = Integer.toString(A);
        int r=1;
        for (int i = 0; i < a.length(); i++) {
            r=(a.charAt(i)-'0')*r;
            if (r==0) return 0;
        }
        return r;
    }
}
