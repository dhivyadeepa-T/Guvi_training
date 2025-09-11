package guvi_day3;

public class DerivedOne extends Base1 {
 int b,tot;
 DerivedOne(int a ,int b){
	 super(a);//baseclass constructor call
	 System.out.println("Inside DerivedOne Constructer");
	 this.b=b;//current to parameter
 }
 public void sum()
 {
	 tot=a+b;
	 System.out.println("total="+tot);
 }
 @Override
 public void display()
 {
	 System.out.println("Base Class");
 }
 public static void main(String[]str) {
	 DerivedOne obj1= new DerivedOne(3,4);
	 obj1.sum();
	 obj1.display();
 }
}
