import java.util.*;
public class Solution {
    public ArrayList<Integer> solve(String A) {
         Integer[] integers = new Integer[26];    
         Arrays.fill(integers, 0);
         List<Integer> a = Arrays.asList(integers);
         ArrayList<Integer> count = new ArrayList<Integer>(a);
         for(int i =0;i<A.length();i++){
            char ch = A.charAt(i);
            int value = ch - 97;
            count.set(value,count.get(value)+1);
        }
        return count;
    }
}
