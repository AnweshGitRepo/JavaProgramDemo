package javaPraticeProgram;

public class StringAdditionNumber {

	public static void main(String[] args) {
		
		String str="java1234file";
		int sum=0;
		for(int i=0;i<=str.length()-1;i++) {
			char c=str.charAt(i);
			if(Character.isDigit(c)) {
			sum=sum+Character.getNumericValue(c);
			
			System.out.print(c);
			}	

		}
	System.out.println(sum);
	}

}
