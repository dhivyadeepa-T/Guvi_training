package guvi_day3;

public class SencondLargestNumber {

	public static void main(String[]args) {
		int[] numbers= {10,20,76,4,53,99};
		int second_largest=Integer.MIN_VALUE;
		int first_largest=Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>first_largest) {
				second_largest=first_largest;
				first_largest=numbers[i];
			}
				else if(numbers[i]>second_largest&& numbers[i]!=first_largest)
				{
					second_largest=numbers[i];
				}
			}
				System.out.println("second largest="+second_largest);
			}
		}

