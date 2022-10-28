package javaPraticeProgram;

import java.util.Scanner;

public class CountTheVowelsInGivenString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String ss=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<ss.length();i++) {
			
			if(ss.charAt(i)=='a'||ss.charAt(i)=='e'||ss.charAt(i)=='i'||ss.charAt(i)=='o'||ss.charAt(i)=='u') {
				count++;
				
			}
			
			
		}
		
		System.out.println(count);
		
		
	}
	
	
	
}
