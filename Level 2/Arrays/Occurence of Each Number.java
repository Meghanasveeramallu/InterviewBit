public class Solution {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        SortedMap<Integer, Integer> sm = new TreeMap<Integer, Integer>();
        for (int i:A){
            if (sm.containsKey(i)) sm.put(i, sm.get(i) + 1);
            else sm.put(i, 1);
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i:sm.values())
        a.add(i);
        return a;
    }
}
