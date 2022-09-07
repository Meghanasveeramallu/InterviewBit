public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>(2);
        ans.add(findFirst(A, B));
        ans.add(findLast(A, B));
        return ans;
    }
    int findFirst(final List<Integer> A, int target){
        int idx = -1;
        int start = 0;
        int end = A.size() - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(A.get(mid) >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(A.get(mid) == target) idx = mid;
        }
        return idx;
    }
    int findLast(final List<Integer> A, int target){
        int idx = -1;
        int start = 0;
        int end = A.size() - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(A.get(mid) <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(A.get(mid) == target) idx = mid;
        }
        return idx;
    }
}
