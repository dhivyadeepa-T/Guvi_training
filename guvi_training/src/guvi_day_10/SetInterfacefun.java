package guvi_day_10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class SetInterfacefun {
	public static int uniqueValueSize(ArrayList<Integer>list) {
		HashSet<Integer> set= new HashSet<>();
		int uniqueSize=set.size();
		return uniqueSize;
	}
	public static void main(String[]args) {
Scanner sc= new Scanner(System.in);
int size=sc.nextInt();
ArrayList<Integer>list=new ArrayList<Integer>();
for(int i=0;i<size;i++) {
	int input=sc.nextInt();
	list.add(input);
}
System.out.println("unique size:"+list);

}
}
