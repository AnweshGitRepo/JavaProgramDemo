package javaPraticeProgram;

import java.util.Random;
import java.util.Scanner;

public class PrintPrimeNo1To100 {

	
	public static void main(String[] args) {    
   for(int j=2;j<=100;j++)
    {
     int count=0;
     for(int i=1;i<=j;i++)
    {
     if(j%i==0)
     {
	 count++;        
     }
     }
      if(count==2)
    System.out.print(j+"  ");     
   }
	}
	
  }
	

