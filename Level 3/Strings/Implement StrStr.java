public class Solution {
    int[] table;
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        if(B==null || B.length()==0) return 0;
        if(A == null || A.length()==0) return -1; 
        int m = B.length();
        int n = A.length();
        table = new int[m];
        buildtable(B);
        int i=0,j=0;
        while(i<n && j<m){
            if(B.charAt(j)==A.charAt(i)){
                if(j==m-1){
                    return i-j;
                }
                i++;
                j++;
            }
            else if(j>0)
                j = table[j-1];
            else
                i++;
        }
        return -1;
    }
    public void buildtable(String B){
        int m = B.length();
        int i=1, j=0;
        while(i<m){
            if(B.charAt(i)==B.charAt(j)){
                table[i] = j+1;
                i++;
                j++;
            }
            else if(j>0)
                j = table[j-1];
            else
                i++;
        }
    }
}
