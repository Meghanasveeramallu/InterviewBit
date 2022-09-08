public class Solution {
    public int solve(int A, int B, int C) {
        if(B!=C){
            int b=findIthBit(A,B);
            int c=findIthBit(A,C);
            if(b!=c){
                if(b==1){
                    A=clearIthBit(A,B);
                    A=setIthBit(A,C);
                }
                else{
                    A=clearIthBit(A,C);
                    A=setIthBit(A,B);
                }     
            }
        }
        return A;
    }
   
    public int findIthBit(int A,int i){
       int mask=1<<(i-1);
        if( (A & mask)==0 )
          return 0;
        return 1;
    }
    
    public int setIthBit(int A,int i){
        int mask= 1<<(i-1);
        return A | mask;
    }
   
    public int clearIthBit(int A, int i){
        int mask = 1 << (i-1);
        mask =~ mask;
        return A & mask;
    }
}
