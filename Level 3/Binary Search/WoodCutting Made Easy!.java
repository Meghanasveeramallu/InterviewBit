public class Solution {
    public int solve(int[] A, int B) {
        int h = 0;
        int max = 0;
        int min =0;
        int ans = 0;
        
        for(int i=0;i<A.length;i++){
            max = Math.max(max,A[i]);
        }
        
        while(min<=max){
            int mid = min+(max-min)/2;
            long wood = 0;
            for(int j=0;j<A.length;j++){
                if(A[j]-mid>0){
                    wood = wood+A[j]-mid;
                }
            }
            if(wood>=(long)B){
                min = mid+1;
                ans = Math.max(ans,mid);
            }else{
                max = mid-1;
            }
        }
        return ans;
    }
}
