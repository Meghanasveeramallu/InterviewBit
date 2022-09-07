public class Solution {
	public int pow(int x, int n, int d) {
        if(x==0) return 0;
        long res = 1;
        boolean flag = false;
        if(x<0) {
            if( (n & 1) != 0)
                flag = true;
            x = -x;
        }
        while (n > 0) {
            if ((n & 1) != 0)
                res = (res * (long)x ) % d;
            n = n >> 1; 
            long sq = (long)x * (long)x;
            x = (int)(sq % (long)d);
        }
        if(flag)
            return (int)(d-res);
        else
        return (int)res;
	}
}
