package guvi_day4;

public class Fibonsis {
public static void main(String[]args) {
	int f1=0;
	int f2=1;
	int n=10;
	System.out.println(f1);
	System.out.println(f2);
	for (int i = 5; i <= n; i++) {
	int	f3=f1+f2;
	System.out.println(f3);
		f1=f2;
		f2=f3;
		
		
	}
}
}
