public class Solution {
    public String solve(String A) {
        char chArray[] =  A.toCharArray();
        int arr[] =  new int[A.length()];
        for(int i=0;i<A.length();i++){
            arr[i] = Integer.parseInt(""+chArray[i]);
        }
        int deepPosInd =-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                deepPosInd = i;
                break;
            }
        }
        if(deepPosInd==-1){
            return  "-1";
        } 
        int max  = arr[deepPosInd];
        int minInd =  -1;
        int num   =  arr[deepPosInd];
        for(int i=deepPosInd+1;i<arr.length;i++){
            if(arr[i]>num){
                max =  Math.min(max,arr[i]);
                minInd =  i;
            }
        }
        int temp =  arr[deepPosInd];
        arr[deepPosInd] =  arr[minInd];
        arr[minInd] =  temp;
        Arrays.sort(arr,deepPosInd+1,arr.length);
        String ans = "";
        for(int i:arr){
            ans =  ans+i;
        }
        return ans;
    }
}
