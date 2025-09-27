package guvi_day_16;
import java.util.*;
public class Task4 {
Stack<Integer>stack1=new Stack<>();
Stack<Integer>stack2=new Stack<>();
public void addEle(int val) {
	stack1.push(val);
}
public int delEle(){
	if(stack2.isEmpty()) {
		while(!stack1.isEmpty()) {
		stack2.push(stack1.pop());
		}
	}
	if(stack2.isEmpty()) {
		return -1;
	}
	return stack2.pop();
	
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	Task4 obj=new Task4();
	int n=sc.nextInt();
	sc.nextLine();
	List<Integer>list=new ArrayList<>();
	for(int i=0;i<n;i++) {
		String inp=sc.nextLine();
		String[] operation=inp.split(" ");
		if(operation[0].equals("add")){
			obj.addEle(Integer.parseInt(operation[1]));
		}
		else if(operation[0].equals("remove")) {
			list.add(obj.delEle());
			  
		}
	}
	for(int i:list) {
		System.out.println(i+" ");
	}
}
}

