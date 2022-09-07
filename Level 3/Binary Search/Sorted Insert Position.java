public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
        int l=0,h=a.size()-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a.get(m)==b) return m;
            else if(a.get(m)>b) h=m-1;
            else l=m+1;
        }
        return l;
	}
}
