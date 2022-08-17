public class Solution {
    public ArrayList<Integer> primesum(int A) {
        boolean isPrime[] = new boolean[A+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2; i*i<=A; i++)
        {
            for(int j=2*i; j<=A; j=j+i)
            {
                isPrime[j]=false;
            }
        }
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i=2; i<=A/2; i++){
            if(isPrime[i]){
                if(isPrime[A-i]){
                ans.add(i);
                ans.add(A-i);
                return ans;
                } 
            }
        }
        return ans;
    }
}
