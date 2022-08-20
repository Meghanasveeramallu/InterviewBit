public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		HashMap<Integer, Integer> rmap = new HashMap<>();
		HashMap<Integer, Integer> cmap = new HashMap<>();
		for(int i = 0; i< a.size(); i++){
			for(int j=0; j < a.get(0).size(); j++){
				if(a.get(i).get(j) == 0){
					rmap.put(i,j);
					cmap.put(j,i);
				}
			}
   		}
    
		for(int i = 0; i< a.size(); i++){
			for(int j=0; j < a.get(0).size(); j++){
				if(cmap.containsKey(j))
					a.get(i).set(j,0);
				if(rmap.containsKey(i))
					a.get(i).set(j,0);	
			}
		}
	}
}
