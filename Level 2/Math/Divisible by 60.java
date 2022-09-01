public class Solution {
    public int divisibleBy60(ArrayList<Integer> A) {
        int digitSum=0;
        boolean containEven=false;
        boolean containZero=false;
        if(A.size()==1 && A.get(0)==0) return 1;
        for(int x: A){
            if(x==0) containZero=true;
            if(x%2==0 && x!=0) containEven=true;
            digitSum+=x;
        }
        if(containEven && (digitSum % 3 )==0 && containZero )
        return 1;
        return 0;
    }
}
