public class Solution {
	public void sortColors(ArrayList<Integer> a) {
		int i=0;
		int first=0;
		int last=a.size()-1;
		while(i<=last ){
			if(a.get(i)==0){
				int temp=a.get(i);
				a.set(i,a.get(first));
				a.set(first,temp);
				first++;
				i++;
			}
			else if(a.get(i)==2){
				int temp=a.get(i);
				a.set(i,a.get(last));
				a.set(last,temp);
				last--;		
			}
			else i++;
		}
	}
}
