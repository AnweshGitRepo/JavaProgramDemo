package javaPraticeProgram1;

import java.util.HashMap;

public class SwapTwoIntegerArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6};
		int size=3;
		int []a=new int [arr1.length];
		int []b=new int [arr2.length];
		
		for(int i=0;i<size;i++) {
			
			arr1[i]=arr1[i]+arr2[i];
			arr2[i]=arr1[i]-arr2[i];
			arr1[i]=arr1[i]-arr2[i];		
		}
		
		System.out.println("First Array");
		
		for(int i=0;i<size;i++) {
			
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("Second Array\t");
		
		for(int j=0;j<size;j++) {	
			
			System.out.print(arr2[j]+" ");
			
		}
		
	}
		
		
	}

