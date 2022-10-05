public class Solution {
    public String convertToTitle(int A) {
        StringBuffer sb = new StringBuffer();
        while(A>0){
            A--;
            int y = ((A)%26) + 65;
            String s = (char)y + "";
            sb.append(s);
            A/=26;
        }
        return sb.reverse().toString();
    }
}
