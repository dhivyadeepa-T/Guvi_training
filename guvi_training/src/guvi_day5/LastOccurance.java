package guvi_day5;

public class LastOccurance {
	 static int LastOccurance (int[]arr,int target) {
		 int low =0,high =arr.length-1;
		 int result =-1;
while(low<=high) {
	int mid=low+(high-low)/2;
	if(arr[mid]==target) {
		result=mid;
		low=mid+1;
	}
	else if(arr[mid]<target) {
		low=mid+1;
	}
	else {
		high=mid-1;
	}
}
	return result;
	 }
	public static void main(String[]args) {
		int arr[]= {2,4,10,10,10,18,20};
		int target=10;
		int index=LastOccurance(arr,target);
		if(index!=-1) {
			System.out.println("Last Occurence of"+target+"is at index:"+index);
		}
		else {
			System.out.println("Element not found in the array ");
		}
	}
	 }
	 

