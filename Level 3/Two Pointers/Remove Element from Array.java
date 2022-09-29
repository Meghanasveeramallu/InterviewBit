public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
        int index = 0;
	    for(int n:a){
	        if(n!=b) a.set(index++, n);
	    }
	    return index;
	}
}
