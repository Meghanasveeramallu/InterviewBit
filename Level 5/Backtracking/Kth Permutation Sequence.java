public class Solution {
    public String getPermutation(int A, int B) {
        ArrayList<Integer> candidateSet = new ArrayList<>();
        for (int i = 1; i <= A; i++){
            candidateSet.add(i);
        }
        return getPermutation(B - 1, candidateSet);
    }

    private static String getPermutation(int k, ArrayList<Integer> candidateSet) {
        int n = candidateSet.size();
        if (n == 0) {
            return "";
        }
        if (k > factorial(n)) return "";
        int f = factorial(n - 1);
        int pos = k / f;
        k %= f;
        String ch = String.valueOf(candidateSet.get(pos));
        candidateSet.remove(pos);
        return ch + getPermutation(k, candidateSet);
    }

    static int factorial(int n) {
        if (n > 12) {
            return Integer.MAX_VALUE;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}
