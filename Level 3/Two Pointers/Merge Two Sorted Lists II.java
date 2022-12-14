public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int aN = a.size();
        int bN = b.size();        
        int j = 0;
        int i = 0;
        while(i < a.size() && j < b.size()){
            if(a.get(i) < b.get(j)){
                i++;               
            }
            else if(a.get(i) > b.get(j)){
                a.add(i,b.get(j));
                i++;
                j++;                
            }
            else{
                 a.add(i,b.get(j));
                i++;
                j++;
            }
        }
        while(j < bN){
            a.add(b.get(j++));
        }
	}
}
