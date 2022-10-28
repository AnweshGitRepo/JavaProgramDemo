package javaPraticeProgram1;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TableOfNumbers {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int tab=0;
		for(int i=1;i<=10;i++) {
			
			
			tab=num*i;
			System.out.println(tab);
		}
	    
	    
	   
	}
}
