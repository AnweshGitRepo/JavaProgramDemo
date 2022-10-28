package javaPraticeProgram;

public class AverageOfAllArrayElement {
public static void main(String[] args) {

	
	int  a[]= {10,13,15,17,19,3};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) 
			sum=sum+a[i];
			float avrage=sum/a.length;
			System.out.println(avrage);
			
		
		
}
}
