public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int v = 0;
        for(int i=0;i<A.size();i++){
            v ^= A.get(i);
        }
        return v;
    }
}
