package javaPraticeProgram;

public class FirstLetterCapitalInString {
public static void main(String[] args) {
	
	String word="my name is anwesh shrikhande";
	StringBuilder sb=new StringBuilder();
	String ss[]=word.split(" ");

	for(int i=0;i<ss.length;i++) {
		
		sb.append(Character.toUpperCase(ss[i].charAt(0))).append(ss[i].substring(i)).append(" ")
;	
	
	}
	
	System.out.println(sb);
	
	
}
}
