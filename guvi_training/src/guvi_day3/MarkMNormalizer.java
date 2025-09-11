package guvi_day3;

public class MarkMNormalizer {
public static void main(String[]args) {
	int[] marks= {95,76,88,100,93};
	for(int i=0;i<marks.length;i++) {
		marks[i]=Math.min(100,marks[i]+5);
	}
	System.out.println("after adding 5 \n");
for (int i:marks) {
	System.out.println(i);
}
}
}

