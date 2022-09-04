public class Solution {
    public Long solve(String A) {
        String temp="0";
        long sum=0;
        for(int i=0;i<A.length();i++){
            if(Character.isDigit(A.charAt(i))){
                temp+=A.charAt(i);
                if(i==(A.length()-1)){
                  sum=sum+Long.parseLong(temp);  
                }
            }
            else{
                sum=sum+Long.parseLong(temp);
                temp="0";
            }
        }
        return sum; 
    }
}
