public class Solution {
	// DO NOT MODIFY BOTH THE LISTS
	public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int len = a.size() + b.size();
	    if(len % 2 == 1) return findKth(a, 0, b, 0, len / 2 + 1);
	    else return (findKth(a, 0, b, 0, len / 2) + findKth(a, 0, b, 0, len / 2 + 1)) / 2.0;
	}
	
	public int findKth(List<Integer> a, int a_start, List<Integer> b, int b_start, int k){
	    if(a_start >= a.size()) return b.get(b_start + k - 1);
	    if(b_start >= b.size()) return a.get(a_start + k - 1);
	    if(k == 1) return Math.min(a.get(a_start), b.get(b_start));
	    
	    int a_key = a_start + k / 2 - 1 < a.size() ? a.get(a_start + k / 2 - 1) : Integer.MAX_VALUE;
	    int b_key = b_start + k / 2 - 1 < b.size() ? b.get(b_start + k / 2 - 1) : Integer.MAX_VALUE;
	    
	    if(a_key < b_key){
	        return findKth(a, a_start + k / 2, b, b_start, k - k / 2);
	    }
	    else
	       return findKth(a, a_start, b, b_start + k / 2, k - k / 2);
	}
}
