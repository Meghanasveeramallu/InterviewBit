public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        int n=A.size();
        Collections.sort(A);
        int l=0;
        if(n%2==0){
            l=n;
        } else {
            l=n-1;
        }
        int k=0;
        while(k<l){
            int temp=A.get(k+1);
            A.set(k+1,A.get(k));
            A.set(k,temp);
            k=k+2;
        }
        return A;
    }
}
