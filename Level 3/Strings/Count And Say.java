public class Solution {
    public String countAndSay(int A) {
        if(A<=0) return new String();
        StringBuffer cur = new StringBuffer("1");
        StringBuffer prev = new StringBuffer();
        char say = '1';
        int count = 0;
        for(int i=1;i<A;i++){
            prev = cur;
            cur = new StringBuffer();
            say = prev.charAt(0);
            count = 1;
            for(int j=1;j<prev.length();j++){
                if(prev.charAt(j)==say){
                    count++;
                }    
                else{
                    cur.append(count+""+say);
                    count = 1;
                    say = prev.charAt(j);
                }
            }
            cur.append(count+""+say);
        }
        return cur.toString();
    }
}
