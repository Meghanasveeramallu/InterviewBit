public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        String s = A.trim();
        if(s==null || s.length()==0) return 0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count = 0;
            }
            else 
                count++;
        }
        return count;
    }
}
