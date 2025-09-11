package guvi_day3;

public class CountEvenNumber {

	public static void main(String[]args) {
		int[] numbers= {1,2,3,4,5,6};
		
		int evencount=0, oddcount=0;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]%2==0) 
			   evencount++;
			
				else 
					oddcount++;
		}
		
		System.out.println("even number count="+evencount);
		System.out.println("odd number count="+oddcount);
		
			
		}
	}

