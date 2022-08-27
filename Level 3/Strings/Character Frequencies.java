public class Solution {
    public ArrayList<Integer> solve(String A) {
        ArrayList<Integer>list = new ArrayList<>();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet())
        {
            list.add(e.getValue());
        }
        return list;
    }
}
