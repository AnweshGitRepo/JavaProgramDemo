package javaPraticeProgram;

public class FindMissingNumberinArray {

	
	public static void main(String[] args) {
		
	
	
	int number[]= {1,2,3,4,6};
	
	int total=number.length+1;
	int exp=(total*(total+1)/2);
	int numsum=0;
	
	for(int i:number) {
		
		numsum+=i;
		
	}
	
	System.out.println(exp-numsum);
	
}
}