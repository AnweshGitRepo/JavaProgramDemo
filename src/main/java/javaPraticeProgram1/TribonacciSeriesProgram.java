package javaPraticeProgram1;

import java.util.Scanner;

public abstract class TribonacciSeriesProgram {
	
	static public void main(String[] args) {
	
		  
		   int n=50;
		   int x = 0, y = 1, z = 2;  
		  // int w = x + y + z;  

		   System.out.println("Tribonacci Series: ");  
		  // System.out.print(x+y+z);  
		   for(int i=0; i<=n; i++)  
		   {  
		     System.out.print(" "+y); 
		   int   w=x+y+z;
		     x=y;  
		     y=z;  
		     z=w;  
		      
		   }  
		    System.out.println("");  
		 }  
		 
		
		
	

}
 

