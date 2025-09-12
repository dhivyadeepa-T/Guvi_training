package guvi_day4;

public class RemoveConsecutiveDuplicates {

	    public static void main(String[] args) {
	        String str = "aaabbccddeee";
	        StringBuilder result = new StringBuilder();

	        
	        result.append(str.charAt(0));

	        
	        for (int i = 1; i < str.length(); i++) {
	            if (str.charAt(i) != str.charAt(i - 1)) {
	                result.append(str.charAt(i));
	            }
	        }

	        System.out.println("After removing consecutive duplicates: " + result);
	    }
	}


