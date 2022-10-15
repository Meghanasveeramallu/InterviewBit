public class Solution {
    public String minWindow(String A, String B) {
        if(A==null||B==null||A.length()<B.length()) return "";
        Map<Character,Integer> map = new HashMap<>();
        for(char c: B.toCharArray())
        {
            if(!map.containsKey(c)) map.put(c,1);
            else map.put(c,map.get(c)+1);
        }
        int left=0,count=0,minLength=A.length()+1,minLeft=0;
        for(int right=0;right<A.length();right++)
        {
            char r = A.charAt(right);
            if(map.containsKey(r)) 
            { 
                map.put(r,map.get(r)-1); if(map.get(r)>=0) count++; 
            }
                while(count==B.length())
                {
                    if(right-left+1<minLength)
                    {
                        minLength = right-left+1;
                        minLeft = left;
                    }
                    if(map.containsKey(A.charAt(left)))
                    {
                        char l = A.charAt(left);
                        map.put(A.charAt(left),map.get(A.charAt(left))+1);
                        if(map.get(A.charAt(left)) > 0)    count --;
                    }
                    left++;
                }     
            }            
        return (minLength>A.length())?"":A.substring(minLeft,minLeft+minLength); 
    }
}
