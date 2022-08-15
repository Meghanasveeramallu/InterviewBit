class Solution:
    # @param A : integer
    # @param B : integer
    # @param C : integer
    # @param D : integer
    # @return an integer
    def solve(self, A, B, C, D):
        cnt = [0] * 101
        cnt[A] += 1
        cnt[B] += 1
        cnt[C] += 1
        cnt[D] += 1
        for i in range(101):
            if cnt[i] != 0 and cnt[i] != 2:
                return 0
        return 1
