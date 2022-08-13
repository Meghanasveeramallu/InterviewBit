public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int l=0;
        int h=A.size()-1;
        int m;
        int ans=-1;
        while(l<=h){
            m=(l+h)/2;
            if (A.get(m)<=B){
                ans=m;
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return ans+1;
    }
}
