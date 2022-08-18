public class Solution {
    public int solve(ArrayList<Integer> A) {
        int[] B = new int[A.size()];
        for(int i=0;i<B.length;i++)
        B[i] = A.get(i);
        Arrays.sort(B);
        int n = B.length;
        for(int i=0;i<B.length-1;i++){
            if((B[i]==B[i+1])) continue;
            if(B[i]==n-i-1)
            return 1;
        }
        if(B[n-1]==0) return 1;
        return -1;
    }
}
