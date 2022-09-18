public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int ones = 0, twos = 0;
        int commonBits = 0;
        for (Integer aA : A) {
            twos |= (ones & aA);
            ones ^= aA;
            commonBits = ~(ones & twos);
            ones &= commonBits;
            twos &= commonBits;
        }
        return ones;
    }
}
