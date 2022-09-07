public class Solution {
    public int sqrt(int A) {
        long ans=-1;
        long l=0,h=A;
        while(l<=h){
            long mid=(l+h)/2;
            long sqr=(mid*mid);
            if(sqr==A){
                return (int)mid;
            }
            else if(sqr<A){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return (int)ans;
    }
}
