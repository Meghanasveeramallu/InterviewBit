public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i=0;
        while(i<A.size()){
            if(A.get(i) == 0){
                arr.add(A.get(i));
            }
            i++;
        }
        for(int k=0;k<A.size();k++){
            if(A.get(k) != 0){
                arr.add(A.get(k));
            }
        } 
        return arr;
    }
}
