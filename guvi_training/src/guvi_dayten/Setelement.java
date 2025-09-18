package guvi_dayten;

import java.util.ArrayList;
import java.util.HashSet;
public class Setelement {
public static void main(String[]args) {
	HashSet<Integer>set=new HashSet<Integer>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(2);
	set.add(1);
System.out.println("Set array"+set);
ArrayList<Integer>List=new ArrayList<Integer>(set);
System.out.println("Array of 2:"+List.get(2));
for(int i:List) {
	System.out.println(i+" ");
}
System.out.println("Set array: "+set.size());
}
}
