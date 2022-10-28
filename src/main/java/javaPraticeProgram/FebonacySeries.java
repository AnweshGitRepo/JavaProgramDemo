package javaPraticeProgram;

public class FebonacySeries {

	
	
public static void main(String[] args) {
	

	int n=10,c=0,d=1;
	
	for(int i=1;i<n;i++) {
		
	System.out.print(c+" + ");
	
	int a=c+d;
	      c=d;
	      d=a;
		
		
	}
	
}}
