import java.util.*;   
public class Solution {
    public ArrayList<Integer> allFactors(int A) {
		int upperLimit = (int)(Math.sqrt(A));
        ArrayList<Integer> a = new ArrayList<Integer>(); 
        if (A==1){
        a.add(1);
        return a;
        }
		for (int i = 1; i <= upperLimit ; i++) {
			if (i < A && A % i == 0) 
            { 
                if (i!=A/i){
                a.add(i);a.add(A/i);}
                else
                a.add(i);
            }
            
		}
    Collections.sort(a);   
		return a;
    }
}
