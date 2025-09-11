package guvi_day3;

public class Overloading {
 
	void display() {
		System.out.println("hii");
	}
		void display(String name) {
			System.out.println("Hii "+name);
		}
			void display(int a, int b) {
			System.out.println("Product"+a*b);
		}
public static void main(String[]str) {
	Overloading obj =new Overloading();
	obj.display();
	obj.display("joy");
	obj.display(1,3);
}
		}

