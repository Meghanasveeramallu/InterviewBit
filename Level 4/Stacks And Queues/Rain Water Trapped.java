public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int[] height = new int[A.size()];
        for(int i=0;i<height.length;i++){
            height[i] = A.get(i);
        }
        if(height==null || height.length==0) return 0;
        int n = height.length;
        int left = 0, right=n-1, leftmax =0, rightmax=0, max = 0;
        while(left<=right){
            leftmax = Math.max(leftmax, height[left]);
            rightmax= Math.max(rightmax, height[right]);
            if(leftmax<rightmax){
                max+=(leftmax-height[left]);
                left++;
            }
            else{
                max+=(rightmax-height[right]);
                right--;
            }
        }
        return max;
    }
}
