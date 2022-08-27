public class Solution {
    public String multiply(String A, String B) {
        int m = A.length(), n = B.length();
        int[] result = new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int p1=i+j,p2=i+j+1;
                int mul = (A.charAt(i)-'0')*(B.charAt(j)-'0');
                int sum = mul+result[p2];
                result[p2] = sum%10;
                result[p1] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean start = false;
        for(int num:result){
            if(num==0&&!start) continue;
            start = true;
            sb.append(num);
        }
        return (sb.length()==0)?"0":sb.toString();
    }
}
