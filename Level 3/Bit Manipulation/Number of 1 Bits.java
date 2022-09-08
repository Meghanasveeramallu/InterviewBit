public class Solution {
	public int numSetBits(long a) {
        int res = 0;
        while(a != 0) {
            a = a & (a -1);
            res++;
        }
        return res;
	}
}
