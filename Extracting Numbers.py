class Solution:
    # @param A : string
     # @return an long
    def solve(self, A):
        d=''
        su=0
        for i in range(len(A)):
            #print(A[i],d)
            if A[i].isdigit():
                d+=A[i]
            else:
                if d!='':
                    su+=int(d)
                    d=''
        if d!='':
            su+=int(d)
        return su
            
