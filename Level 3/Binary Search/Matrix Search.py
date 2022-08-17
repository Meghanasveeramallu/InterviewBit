class Solution:
    # @param A : list of list of integers
    # @param B : integer
    # @return an integer
    def searchMatrix(self, A, B):
        n=len(A)
        m=len(A[0])
        l=0
        h=m*n-1
        while (l<=h):
            mid=(l+h)//2
            i = mid / m
            j = mid % m
            if (B > A[i][j]):
                l=mid + 1
            elif (B < A[i][j]):
                h = mid - 1
            else:
                return 1
        return 0
