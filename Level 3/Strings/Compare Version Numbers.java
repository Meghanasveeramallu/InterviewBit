public class Solution {
    public int compareVersion(String A, String B) {
        String[] splittedA = A.split("\\.");
	    String[] splittedB = B.split("\\.");
	    
	    int i=0;
	    while(i < splittedA.length && i < splittedB.length) {
	        Long c = 0l;
	        try {
	            Long spA = Long.parseLong(splittedA[i]);
	            Long spB = Long.parseLong(splittedB[i]);
	            c = spA - spB;
	        }
	        catch(Exception e) {
	            String strippedPrecedingZeroA = getWOPZeroes(splittedA[i]);
	            String strippedPrecedingZeroB = getWOPZeroes(splittedB[i]);
	            
	            int compareToValue = (strippedPrecedingZeroA.compareTo(strippedPrecedingZeroB));
                if(compareToValue>0) {
                    return 1;
                }
                else if(compareToValue<0) {
                    return -1;
                }
                else {
                    return 0;
                }
	        }
	        Long comp = c;
	        if(comp == 0) {
	            i++;
	        }
	        else if(comp<0) {
	            return -1;
	        }
	        else {
	            return 1;
	        }
	    }
	    if(splittedA.length<splittedB.length) {
	        boolean allZero = true;
	        for(int j=i;j<splittedB.length;j++) {
	            if(Long.parseLong(splittedB[j]) != 0 ) {
	                allZero = false;
	                break;
	            }
	        }
	        if(allZero) {
	            return 0;
	        }
	        return -1;
	    }
	    else {
	        boolean allZero = true;
	        for(int j=i;j<splittedA.length;j++) {
	            if(Long.parseLong(splittedA[j]) != 0 ) {
	                allZero = false;
	                break;
	            }
	        }
	        if(allZero) {
	            return 0;
	        }
	        return 1;
	    }
	}
    
	private String getWOPZeroes(String a) {
	    if(a.length() == 0) {
	        return a;
	    }
	    int i=0;
	    while(a.charAt(i) == '0') {
	        i++;
	    }
	    return a.substring(i);
    }
}
