package javaPraticeProgram;

public class FindNumberInString {

public static void main(String[] args) {
		
		String str="java3456file";
		
		for(int i=0;i<=str.length()-1;i++) {
			char c=str.charAt(i);
			if(Character.isDigit(c)) {
			
				System.out.println(c);
			
			
			}
		}		
  }
	
}
