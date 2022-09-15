public class Solution {
    private String isAll9(String A){
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!='9')
            return null;
        }
        int count0=A.length()-1;
        StringBuilder num = new StringBuilder("1");
        for(int i=1;i<=count0;i++)
        num.append("0");
        num.append("1");
        return num.toString();
    }
    
    public String solve(String A) {
        if(isAll9(A)!=null)
        return isAll9(A);
        StringBuilder buildNum = new StringBuilder(A);
        int midl = A.length()/2,midr=midl;int displace =0;
        boolean isFormed=true;
         if(A.length()%2==0){
             midl=A.length()/2-1;midr=A.length()/2;
         }
            while(midr+displace<A.length()){
                char left=buildNum.charAt(midl-displace);
                char right=buildNum.charAt(midr+displace);
                if(left == right){
                    displace++;
                    continue;
                }
                else if (left>right){
                    buildNum.setCharAt(midr+displace,left);
                    displace++;
                    break;
                }
                else{
                    isFormed=false;
                    break;
                }
            }            
            while(isFormed && midr+ displace<A.length()){
                buildNum.setCharAt(midr+displace, buildNum.charAt(midl-displace));
                displace++;
            }
            if(isFormed && buildNum.toString().equals(A)){
                isFormed=false;
                buildNum = new StringBuilder(A);
            }
            if (isFormed)
            return buildNum.toString();
            displace=0;
            while(midr+displace<A.length()){
                char left=buildNum.charAt(midl-displace);
                if(left !='9'){
                    char dig = (char)((int)left +1);
                    buildNum.setCharAt(midl-displace, dig);
                    buildNum.setCharAt(midr+displace, dig);
                    displace++;
                    break;
                }
                else{
                    buildNum.setCharAt(midl-displace, '0');
                    buildNum.setCharAt(midr+displace, '0');
                    displace++;
                }
            }
            while(midr+ displace<A.length()){
                buildNum.setCharAt(midr+displace, buildNum.charAt(midl-displace));
                displace++;
            }
            return buildNum.toString();
    }
}
