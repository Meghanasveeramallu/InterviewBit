public class Solution {
    public int solve(int A) {
        int i = 0;
        while((A & (1 << i))==0){
            i++;
        }
        return i;
    }
}
