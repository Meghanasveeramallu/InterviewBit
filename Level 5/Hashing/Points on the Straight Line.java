public class Solution {
	public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int maxPoints = 0;
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        if(a.size() != b.size() || a.size() == 0 || a == null || b.size() == 0 || b == null)
            return maxPoints;
        if(a.size() == 1 && b.size() == 1)
            return 1;
        for(int i = 0; i < a.size(); i++){
            int duplicate = 1;
            int vertical = 0;
            int xi = a.get(i);
            int yi = b.get(i);
            for(int j = i+1; j < a.size(); j++){
                int xj = a.get(j);
                int yj = b.get(j);
                if(xi == xj){
                    if(yi == yj) duplicate++;
                    else vertical++;
                }
                else{
                    double slope = 0.0;
                    if(yj - yi == 0)
                        slope = 0.0;
                    else if(xj - xi == 0)
                        slope = Double.MAX_VALUE;
                    else
                        slope = (double)(yj - yi) / (double)(xj - xi);
                    
                    if(map.containsKey(slope))
                        map.put(slope, map.get(slope) + 1);
                    else 
                        map.put(slope, 1);
                }
            }
            
            for(int sl : map.values())
                if(maxPoints < sl + duplicate)
                maxPoints = sl + duplicate;
            
            maxPoints = Math.max(vertical + duplicate, maxPoints);
            map.clear();
        }
        
        
        return maxPoints;
	}
}
