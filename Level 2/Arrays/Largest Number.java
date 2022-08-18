public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        if(A.size() == 1) return String.valueOf(A.get(0));
        int count = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) == 0) count++;
        }
        if(count == A.size() || A.isEmpty()) return "0";
        
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            list.add(A.get(i)+"");
        }
        Collections.sort(list,(a,b) -> (b + a).compareTo(a + b));
        String ans = String.join("", list);
        return ans;                         
    }
}
