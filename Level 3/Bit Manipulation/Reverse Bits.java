public class Solution {
	public long reverse(long a) {
        long num = 0;
        int i=0;
        while(i < 32){
            num <<= 1;
            if((a & (1<<i)) !=0){
                num |=1;
            }
            i++;
        }
        return num;
    }
}
