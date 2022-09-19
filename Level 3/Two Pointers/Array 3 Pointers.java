public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int i = 0, j = 0,  k = 0;
	    int result = Integer.MAX_VALUE;
	    while(i<A.size() && j<B.size() && k<C.size()){
	        int x = A.get(i), y = B.get(j), z = C.get(k);
	        int min = getMin(x,y,z);
	        int max = getMax(x,y,z);
	        result = Math.min(result, max-min);
	        if(min==x) i++;
	        else if(min==y) j++;
	        else if(min==z) k++;
	    }
	    return result;
	}
	public int getMin(int a, int b, int c){
	    return Math.min(a,Math.min(b,c));
	}
	public int getMax(int a, int b, int c){
	   return Math.max(a,Math.max(b,c));
    }
}
