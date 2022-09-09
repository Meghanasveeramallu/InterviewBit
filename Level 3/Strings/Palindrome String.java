public class Solution {
    public int isPalindrome(String A) {
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<A.length(); i++){
            if(!Character.isLetterOrDigit(A.charAt(i))) continue;
            else temp = temp.append(Character.toLowerCase(A.charAt(i)));
        }
        int start = 0, end = temp.length()-1;
        while(start <= end){
            if(temp.charAt(start) == temp.charAt(end)){
                start++;
                end--;
            }
            else return 0;
        }
        return 1;
    }
}
