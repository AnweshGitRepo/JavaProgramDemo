package javaPraticeProgram;

import java.util.Arrays;

public class MergeTwoIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first[]= {2,4,56,7};
		int second[]= {1,3,76,8};
        int totalLenght[]=new int[first.length+second.length];
	
        for(int i=0;i<first.length;i++) {
        	totalLenght[i]=first[i];
	}
		
	for(int j=0;j<second.length;j++) {
		
		totalLenght[j+second.length]=second[j];
		
	}
	
	System.out.println(Arrays.toString(totalLenght));
	
	}
	
	
	

}
