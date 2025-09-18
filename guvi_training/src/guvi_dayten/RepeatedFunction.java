package guvi_dayten;

import java.util.HashSet;
import java.util.*;
public class RepeatedFunction {
public static int firstRepeated(HashSet<Integer>arr) {
	HashSet<Integer>set=new HashSet<>();
	for(int i:arr) {
		if(set.add(i)==false) {
			return i;
		}
	}
	return -1;
}
public static void main(String[]args) {
	
}
}
