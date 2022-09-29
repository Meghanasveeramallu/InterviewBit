public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    int index = 0;
	    for(int n:a){
	        if(index<2 || n!=a.get(index-2)){
	            a.set(index++,n);
	        }
	    }
	    return index;
	}
}
