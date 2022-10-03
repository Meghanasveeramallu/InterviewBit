public class Solution {
    public int adjacent(ArrayList<ArrayList<Integer>> A) {
        if (A.isEmpty()) return 0;
	    if (A.get(0).isEmpty()) return 0;
	    int prec = 0;
	    int last = 0;
	    for (int i = 0; i < A.get(0).size(); ++i) {
	        int total = Math.max(A.get(0).get(i), A.get(1).get(i)) + prec;
	        int res = Math.max(total, last);
	        prec = last;
	        last = res;
	    }
	    return Math.max(prec, last);
    }
}
