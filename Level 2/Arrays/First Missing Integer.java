public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        for(int i=0; i<A.size(); i++){
            if(A.get(i) > 0 && A.get(i) < A.size() && A.get(i) != A.get(A.get(i)-1)){
                swap(A,A.get(i)-1,i);
                i--;
            }
        }
        for(int i=0; i<A.size(); i++){
            if(A.get(i) != i + 1) return i + 1;
        }
        return A.size() + 1;
    }
    
    void swap(ArrayList<Integer> A, int x, int y){
        int temp = A.get(x);
        A.set(x,A.get(y));
        A.set(y,temp);
    }
}
