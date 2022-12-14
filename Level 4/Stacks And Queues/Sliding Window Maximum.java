public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int[] nums = new int[A.size()];
        for(int i=0;i<nums.length;i++){
            nums[i] = A.get(i);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(nums==null || nums.length==0 || B<=0) return result;
        int n = nums.length;
        int index = 0;
        Deque<Integer> q = new ArrayDeque<Integer>();
        for(int i=0;i<nums.length;i++){
            while(!q.isEmpty() && i-B+1>q.peek())
            q.poll();
            while(!q.isEmpty() && nums[i]>nums[q.peekLast()])
                q.pollLast();
            q.offer(i);
            if(i>=B-1)
                result.add(nums[q.peek()]);
        }
        return result;
    }
}
