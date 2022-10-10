public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findSubstring(String A, final List<String> B) {
        String[] words = new String[B.size()];
        for(int i=0;i<words.length;i++)
        words[i] = B.get(i);
        ArrayList<Integer> result = new ArrayList();
        Map<String, Integer> map = new HashMap<>();
        for(String word:words){
            if(map.containsKey(word)) map.put(word,map.get(word)+1);
            else map.put(word,1);
        }
        int m =words[0].length();
        int n=words.length;
        for(int i=0;i<=A.length()-n*m;i++){
            Map<String, Integer> copy = new HashMap(map);
            int j=i,k=n;
            while(k>0){
                String str = A.substring(j, j+m);
               if (!copy.containsKey(str) || copy.get(str) < 1) break;
        		copy.put(str, copy.get(str)-1);
                k--;j+=m;
            }
            if (k == 0) result.add(i);
        }
        return result;
    }
}
