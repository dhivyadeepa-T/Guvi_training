package guvi_day2;

public class ClassandObject {

    int a, b, c;


    ClassandObject(int a, int b) {
        this.a = a;
        this.b = b;
    }

   
    void add() {
        String s = "local variable";
        c = a + b;
        System.out.println("Sum: " + c);
    }
  
    public static void main(String[] str) {
        ClassandObject obj1 = new ClassandObject(5, 3);
        obj1.add();

        ClassandObject obj2 = new ClassandObject(6, 7);
        obj2.add();
    }
}
