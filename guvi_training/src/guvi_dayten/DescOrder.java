package guvi_dayten;

import java.util.ArrayList;
import java.util.Collections;
public class DescOrder {
	 public static void main(String[]args) {
	  	ArrayList<Integer>set=new ArrayList<Integer>();
	  	
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(1);
	        System.out.println("before Desending order sort:"+(set));
	        Collections.sort(set,Collections.reverseOrder());
			System.out.println("Desending order sort:"+(set));
			
		}
	}



