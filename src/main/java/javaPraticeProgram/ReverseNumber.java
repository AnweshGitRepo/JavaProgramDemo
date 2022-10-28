package javaPraticeProgram;

public class ReverseNumber {
public static void main(String[] args) {
	

	
	int n=1234,rev=0;
	int temp=n;
	while(n>0) {
		/*
		 * int reminder = n % 10; rev = rev * 10 + reminder; n = n / 10;
		 */
		rev=rev*10;
		rev=rev+n%10;
		n=n/10;
		
		
	}
	
	System.out.println("Before Reverse= "+temp+" || After Reverse= "+rev);
	
	
}
}