package guvi_day_14;

public class FibbonacciSerious {
	/*public static void main(String[]args) {
	long n=50;
	long first=0;
	long second=1;
	System.out.println(n+" ");
	for(int i=0;i<=n;i++) {
	System.out.print(first+" ");
	long nextterm=first+second;
	first=second;
	second=nextterm;
	}*/
	static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[]args) {
		int n=10;
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
			}
}
}
