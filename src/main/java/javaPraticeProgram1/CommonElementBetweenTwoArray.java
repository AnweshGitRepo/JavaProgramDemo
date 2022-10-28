package javaPraticeProgram1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementBetweenTwoArray {
  public static void main(String[] args) {
	  int arr1[]= {23,34,45,56,11};
		int arr2[]= {23,1,45,56,34};
	  
	  for(int i=0;i<arr1.length;i++) {
		  
		  for(int j=0;j<arr2.length;j++) {
			  
		if(arr1[i]==arr2[j]) {
			
			System.out.print(arr1[i]+" ");
			
		}	  
	  }
	 }
		
		
		
	  
}
}
