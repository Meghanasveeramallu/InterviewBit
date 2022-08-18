public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int maxSums=A.get(0);
        int minSums=A.get(0);
        for(int i=0;i<A.size();i++)
        {
            maxSums=Math.max(maxSums,A.get(i)+i);
            minSums=Math.min(minSums,A.get(i)+i);
        }
        int sumsRes=maxSums-minSums;
        
        int maxDif=A.get(0);
        int minDif=A.get(0);
        for(int i=0;i<A.size();i++)
        {
            maxDif=Math.max(maxDif,A.get(i)-i);
            minDif=Math.min(minDif,A.get(i)-i);
        }
        int difsRes=maxDif-minDif;
        return Math.max(difsRes,sumsRes);
    }
}
