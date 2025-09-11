package guvi_day4;
import java.util.Arrays;
public class WordFrequent {
public static void main(String[]args) {
	String str="java coding java";
	String[] word=str.split(" ");
	int n=word.length;
	System.out.println(n);
	boolean visited1[]=new boolean[n];
	Arrays.fill(visited1, false);
	int count=0;
	for(int i=0;i<n;i++) {
		count=0;
		if(!visited1[i]) {
			visited1 [i]=true;
			count=count+1;
			for(int j=i+1;j<n;j++) {
				if(word[i].equals(word[j])) {
					visited1[j]=true;
					count=count+1;
				}
				System.out.println("count of"+word[i]+"="+count);
			}
		}
	}
	
}
}
