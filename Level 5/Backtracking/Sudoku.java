public class Solution {
	public void solveSudoku(ArrayList<ArrayList<Character>> a) {
        char[] digits = new char[9];
	    
	    for (int i = 0; i < 9; i++){
	        digits[i] = (char)((i + 1) + '0');
	    }
	    
	    boolean ans = solve(a, digits);
	}
	
	boolean solve(ArrayList<ArrayList<Character>> a, char[] digits){
	    for (int row = 0; row < 9; row++){
	        for (int col = 0; col < 9; col++){
	            char ch = a.get(row).get(col);
	            if (ch == '.'){
	                for (int i = 0; i < digits.length; i++){
	                    boolean flag = false;
	                    if (isPossible(a, row, col, digits[i])){
	                        a.get(row).set(col, digits[i]);
	                        flag = solve(a, digits);
	                        if (flag)
    	                        return flag;
    	                    a.get(row).set(col, '.'); 
	                    } 
	                }
	                return false;  
	            }
	        }
	    }
	    return true;
	}
	
	boolean isPossible (ArrayList<ArrayList<Character>> a, int r, int c, char digit){
	    ArrayList<Character> row = a.get(r);
	    for (int i = 0; i < 9; i++){
	        if (row.get(i) - digit == 0)
	            return false;
	    }
	    
	    for (int i = 0; i < 9; i++){
	        if (a.get(i).get(c) - digit == 0)
	            return false;
	    }
	    
	    for (int i = (r/3)*3; i < ((r/3)*3) + 3; i++){
	        for (int j = (c/3) * 3; j < ((c/3)*3) + 3; j++){
	            if (a.get(i).get(j) - digit == 0)
	                return false;
	        }
	    }
	    return true;
	}
}
