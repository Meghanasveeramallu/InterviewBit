public class Solution {
	public void arrange(ArrayList<Integer> a) {
	    int n = a.size();
        for (int i = 0; i < n; i++) {
            int num = a.get(i);
            int b = num;
            int c = a.get(num);
            if (c >= n) {
                c = a.get(num) % n;
            }
            int encode = b + c * n;
            a.set(i, encode);
        }
        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) / n);
        }
	}
}
