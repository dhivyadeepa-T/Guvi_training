package guvi_day3;

public class RemoveSpace {
public static void main(String[]str) {
	String Str="Hello World";
	char[] chr_arr =Str.toCharArray();
	String res="";
	for(char c :chr_arr) {
	if(c!=' '){
	
		res+=c;
	}
}

System.out.println("original String="+Str);
System.out.println("without space="+res);
}
}