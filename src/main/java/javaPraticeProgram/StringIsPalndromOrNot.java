package javaPraticeProgram;

public class StringIsPalndromOrNot {
public static void main(String[] args) {
	

	String s="sds";
	String b="";
	for(int i=s.length()-1;i>=0;i--) {
		
		b=b+s.charAt(i);				
	}
	if(s.equals(b)) {
		System.out.println(" palandrom");
	}else {
	System.out.println(" not palandrom");
	}
}
}