public class Solution {
    public int solve(int[] A, int B, int C) {
        int fine=0;
        if(B%2 == 0) {
            for(int i=0 ; i<A.length ; i++){
                if(A[i]%2 != 0){
                    fine = fine+C;
                }
            }
        }
        else{
            for(int i=0 ; i<A.length ; i++){
                if(A[i]%2 == 0){
                    fine = fine+C;
                }
            }
        }
        return fine;
    }
}
