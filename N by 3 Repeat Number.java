public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int x : a){
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else
            {
                map.put(x,map.get(x) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > a.size() / 3){
                return entry.getKey();
            }
        }
        return -1;
	}
}
