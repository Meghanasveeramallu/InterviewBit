public class Solution {
    public int cpFact(int A, int B) {
         if(gcd(A,B)== 1) return A;
        return cpFact(A/gcd(A,B),B);
    }
    
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
