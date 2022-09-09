public class Solution {
    public String solve(String A) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        String ans="";
        for(int i=0 ; i<A.length() ; i++){
            char cc=A.charAt(i);
            map.put(cc,map.getOrDefault(cc,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            ans+=e.getKey()+Integer.toString(e.getValue());
        }
        return ans;
    }
}
