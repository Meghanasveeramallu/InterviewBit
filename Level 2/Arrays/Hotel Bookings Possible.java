class Pair{
    int arrival;
    int departure;
    Pair(int a,int d){
        arrival = a;
        departure = d;
    }
}
public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        if(arrive.size()<=K) return true;
       
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<arrive.size();i++){
            list.add(new Pair(arrive.get(i),depart.get(i)));
        }
       
        Collections.sort(list,(a,b)->{
            return a.arrival-b.arrival;
        });
       
        PriorityQueue<Integer> pq = new PriorityQueue<>();      
        for(int i=0;i<list.size();i++){
            if(pq.size()>0 && list.get(i).arrival > pq.peek()){
                pq.poll();
            }
            pq.offer(list.get(i).departure);
            if(pq.size() > K) return false;
        }
        return  true;
    }
}
