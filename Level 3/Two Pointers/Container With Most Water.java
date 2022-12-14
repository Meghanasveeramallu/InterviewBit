public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        int[] height = new int[A.size()];
        for(int i=0;i<height.length;i++) height[i] = A.get(i);
        int left = 0, right = height.length - 1;
	    int maxArea = 0;

	    while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])* (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
	    }

	    return maxArea;
    }
}

