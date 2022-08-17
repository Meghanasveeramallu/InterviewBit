public class Solution {
    public String addBinary(String A, String B) {
        int i =A.length()-1,j=B.length()-1;
        int sum = 0, carry = 0;
        StringBuffer sb = new StringBuffer();
        while(i>=0 || j>=0 || carry!=0){
            int x = (i>=0)?A.charAt(i--)-'0':0;
            int y = (j>=0)?B.charAt(j--)-'0':0;
            sum = (x+y+carry)%2;
            carry = (x+y+carry)/2;
            sb.append(sum+"");
        }
        return sb.reverse().toString();
    }
}
