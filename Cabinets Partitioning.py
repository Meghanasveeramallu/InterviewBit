class Solution:
    # @param A : integer
    # @param B : integer
    # @param C : list of integers
    # @return an integer
    def paint(self, k, b, arr):
        lo = max(arr)
        hi = sum(arr)
        n=len(arr)
    
        while (lo < hi):
            mid = lo + (hi - lo) // 2
            requiredPainters = self.numberOfPainters(arr, n, mid)
            if (requiredPainters <= k):
                hi = mid
            else:
                lo = mid + 1
        return ((lo*b)%10000003)
        
    def numberOfPainters(self,arr, n, maxLen):
        total = 0
        numPainters = 1
    
        for i in arr:
            total += i
    
            if (total > maxLen):
                total = i
                numPainters += 1
    
        return numPainters
