public class Solution {
    public int solve(String A, String B) {
        int last=Character.getNumericValue(A.charAt(A.length()-1));
        if(last==1 || last==5 || last==6)  return last;
        int b=Character.getNumericValue(B.charAt(B.length()-1));
        if(B.length()>1)
            b+=Character.getNumericValue(B.charAt(B.length()-2)) *10;
        int rem = b % 4;  
        if(rem==0)  rem=4;
        int x=last;
        for(int i=1;i<rem;i++)
            x*=last;
        return x%10; 
    }
}
