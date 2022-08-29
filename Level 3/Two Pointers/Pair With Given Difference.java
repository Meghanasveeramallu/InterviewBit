public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);  
        int i = 0;
        int j = 1;
        while(j < A.size() && i < A.size()){
                int d = A.get(j) - A.get(i);
                if(d == B && i != j)
                    return 1;
                else if(d < B)
                    j++;
                else 
                    i++;   
        }
        return 0;
    }
}
