package guvi_day4;

public class Casesentitity {
	
	    public static void main(String[] args) {
	        String str = "COMPUTer";
	        StringBuilder result = new StringBuilder();

	        for (char c : str.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                result.append(Character.toLowerCase(c));
	            } else if (Character.isLowerCase(c)) {
	                result.append(Character.toUpperCase(c));
	            } else {
	                result.append(c); // keep same for non-alphabet
	            }
	        }

	        System.out.println("Original: " + str);
	        System.out.println("Swapped: " + result.toString());
	    }
	}

