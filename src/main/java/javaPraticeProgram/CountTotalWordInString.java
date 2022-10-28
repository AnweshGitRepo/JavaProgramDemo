package javaPraticeProgram;

public class CountTotalWordInString {
public static void main(String[] args) {
	
	String word="my name is anwesh shrikhande";
	
	int count=1;
	
	for(int i=0;i<=word.length()-1;i++) {
	
	if(word.charAt(i)==' '&& word.charAt(i+1)!=' ') {
		
		count++;	
	}	
	
}
	
	System.out.println(count);
	
	
}
	
}
