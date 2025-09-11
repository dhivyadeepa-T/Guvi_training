package guvi_day4;

public class ReverseString {
public static void main(String[]args) {
	String str="coding",rev_str;
	char[] chars = str.toCharArray();
	int n=str.length();
	int start=0;
	int end =n-1;
	while(start<end)
	{
		if(!Character.isLetter(chars[start])) {
			start++;
		}
		else if (!Character.isLetter(chars[end])) {
			end--;
	}
		else {
			char temp=chars[start];
			chars[start]=chars[end];
			chars[end]=temp;
			start++;
			end--;
		}
}

rev_str= new String(chars);
System.out.println("original String = "+ str);
System.out.println("revese String = "+ rev_str);
}
}
