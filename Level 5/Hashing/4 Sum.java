public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(A.size() < 4) return result;
        for(int i = 0; i < A.size(); i++){
            for(int j = i+1; j < A.size(); j++){
                int k =j+1;
                int l = A.size()-1;
                while(k < l){
                    int sum = A.get(i) + A.get(j) + A.get(k) + A.get(l);
                    if(sum > B){
                        l--;
                    }
                    else if(sum < B){
                        k++;
                    }
                    else if(sum == B){
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(A.get(i));
                        list.add(A.get(j));
                        list.add(A.get(k));
                        list.add(A.get(l));   
                        if(!set.contains(list)){
                            set.add(list);
                            result.add(list);
                        }
                        k++;
                        l--;
                    }
                }
            }
        }
        return result;
    }
}
