public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<B-1;i++) map.put(A.get(i),map.getOrDefault(A.get(i),0)+1);
        for(int i=0,j=B-1;j<A.size();i++,j++){
            int num1=A.get(j),num2=A.get(i);
            map.put(num1,map.getOrDefault(num1,0)+1);
            result.add(map.size());
            int pre=map.get(num2);
            if(pre==1) map.remove(num2);
            else map.put(num2,pre-1);
        }
        return result;
    }
}
