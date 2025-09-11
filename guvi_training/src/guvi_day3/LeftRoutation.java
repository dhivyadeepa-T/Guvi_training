package guvi_day3;
import java.util.Arrays;
public class LeftRoutation {

	    public static void leftRotate(int[] arr, int k) {
		int temp;
		int n=arr.length;
		k=k%n;
		for(int i=0;i<k; i++);
		{
			temp = arr[0];
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
	    }
	    public static void main(String[]str)
	    {
	    	int[] values= {1,2,3,4,5,6};
	    	int k=2;
	    	System.out.println("before Rotation");
	    	System.out.println(Arrays.toString(values));
	    	 leftRotate(values,k);
	    	System.out.println("after Rotation");
	    	System.out.println(Arrays.toString(values));
	    }
	    }
	
