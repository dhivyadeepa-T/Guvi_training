package guvi_day4;

public class LinearSearch {
	public static int lin_search(int number[],int key) {
	
	for(int i=0;i<number.length;i++) {
		if(number [i]==key ) {
			return i;
		}
	}
	return -1;
}

public static void main(String[]args) {
	int[]number = {12,6,8,12,15,2};
	int key=15;
	int result=lin_search(number,key);
	if(result!=-1) {
		System.out.println("key found at index:"+result);
	}
	else {
		System.out.println("key not found in the array");
	}
}
}