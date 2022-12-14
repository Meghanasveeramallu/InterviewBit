public class Solution {
    ArrayList<ArrayList<Integer>> result;
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        result = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        getCombsWithSum(A, 0, 0, new ArrayList<Integer>(), B);
        return result;
    }
    
    private void getCombsWithSum(ArrayList<Integer> A, int index, int sum, ArrayList<Integer> curr, int B){
        if(index >= A.size() || sum > B){
            return;
        }
        if(sum == B){
            result.add(new ArrayList<Integer>(curr));
            return;    
        }
        
        for(int i = index; i < A.size(); i++){
            if(i == index || A.get(i) != A.get(i-1)){
                curr.add(A.get(i));
                getCombsWithSum(A, i, sum + A.get(i), curr, B);
                curr.remove(curr.size()-1);
            }
            
        }
    }
}
