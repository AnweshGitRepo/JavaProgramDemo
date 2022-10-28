package javaPraticeProgram1;

public class AmstrongNumber {

	//153 =1*1*1 + 5*5*5 + 3*3*3
	//       1   + 125   +  27
	
	public static void main(String[] args) {
			
		int digit=153, number = digit , temp,total = 0;
	
		while (number>0) {
			
			temp=number%10;   //last digit means Reminder 15.3
			total=total+temp*temp*temp;	
			number=number/10;  //  15.3
		 }
		
		if(total==digit) {	
			System.out.println("amstrong number");
		}else {
		System.out.println("not amstormg");
		}
	}
}
