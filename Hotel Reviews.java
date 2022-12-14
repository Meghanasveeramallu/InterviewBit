public class Solution {
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        ArrayList<Integer> result = new ArrayList();
        Map<Integer, LinkedHashSet<Integer>> map = new HashMap();
        if(B==null || B.size()==0) return result;
        Set<String> set = new HashSet();
        String[] words = A.split("_");
        for(String word:words) set.add(word);
        int index = 0,max=0;
        for(String b:B){
            String[] tokens = b.split("_");
            int count = 0;
            for(String t:tokens){
                if(set.contains(t)) count++;
            }
            max = Math.max(count,max);
            if(map.get(count)==null) map.put(count, new LinkedHashSet<Integer>());
            map.get(count).add(index);
            index++;
        }
        for(int i=max;i>=0;i--){
            if(map.get(i)!=null){
                for(Integer val:map.get(i)){
                    result.add(val);
                }
            }
        }
        return result;
    }
}
