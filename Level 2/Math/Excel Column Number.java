public class Solution {
    public int titleToNumber(String A) {
        int result = 0;
        for(int i=0;i<A.length();i++){
            char c = A.charAt(i);
            result = result*26 + (c-'A'+1);
        }
        return result;
    }
}
