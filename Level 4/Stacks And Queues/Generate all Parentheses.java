public class Solution {
    public int isValid(String A) {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<A.length();i++){
            String s = A.substring(i,i+1);
            if(s.equals("(") || s.equals("{") || s.equals("[")) stack.push(s);
            else{
                String f;
                if(!stack.empty()){
                    f = stack.pop();
                    if((s.equals(")") && f.equals("("))) continue;
                    else if((s.equals("}") && f.equals("{"))) continue;
                    else if((s.equals("]") && f.equals("["))) continue;
                    else return 0;
                }
                else return 0;
            }
        }
        if(stack.size()>0) return 0;
        return 1;
    }
}
