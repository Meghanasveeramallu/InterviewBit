public class Solution {
    public int power(String A) {
        if(A.equals("2")) return 1;
        String dividend[] = A.split("");
        if(Integer.valueOf(dividend[dividend.length -1])%2 != 0) return 0;
        String quotient  = "";
        String remainder = "";
        for(String a:dividend){
            int x = Integer.valueOf(a);
            if(quotient.length() == 0){  
                if(x%2 != 0) remainder +=x%2;
                quotient+= x/2;
            }
            else if(remainder.length() != 0){
                remainder+=x;
                int r = Integer.valueOf(remainder);
                quotient+= r/2;
                if(r%2 == 0) remainder = "";
                else remainder = String.valueOf(r%2);
            }
            else if(quotient.length()!=0 && remainder.length() == 0){
                quotient+= x/2;
                if(x%2 != 0) remainder = String.valueOf(x%2);
            }
        }
        if(quotient.charAt(0) == '0') quotient = quotient.substring(1);
        return power(quotient);
    }
}
