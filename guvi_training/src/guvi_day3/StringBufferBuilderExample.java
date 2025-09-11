
package guvi_day3;

public class StringBufferBuilderExample {
    public static void main(String[] args) {
        // Using StringBuffer (Thread-safe, synchronized)
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("StringBuffer after append: " + stringBuffer);

        stringBuffer.insert(5, " Java");
        System.out.println("StringBuffer after insert: " + stringBuffer);

        stringBuffer.replace(0, 5, "Hi");
        System.out.println("StringBuffer after replace: " + stringBuffer);

        stringBuffer.delete(2, 7);
        System.out.println("StringBuffer after delete: " + stringBuffer);

        // Using StringBuilder (Not synchronized, faster for single-threaded)
        StringBuilder stringBuilder = new StringBuilder("Welcome");
        stringBuilder.append(" to Java");
        System.out.println("\nStringBuilder after append: " + stringBuilder);

        stringBuilder.insert(7, " World");
        System.out.println("StringBuilder after insert: " + stringBuilder);

        stringBuilder.replace(0, 7, "Greetings");
        System.out.println("StringBuilder after replace: " + stringBuilder);

        stringBuilder.delete(9, 15);
        System.out.println("StringBuilder after delete: " + stringBuilder);
    }
}
