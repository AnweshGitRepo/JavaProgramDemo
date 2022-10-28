package javaPraticeProgram1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		
		int temp, size;
		int array[]= {12,65,23,43,54};
		
		size=array.length;
		
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				
				if(array[i]<array[j]) {
					
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		
		System.out.println(array[size-2]);
	
		
	}	
		
	}

