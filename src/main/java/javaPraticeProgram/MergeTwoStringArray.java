package javaPraticeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String arr1[]= {"a","b","c"};
		String arr2[]= {"d","e","f"};
	
 List al =new ArrayList<>(Arrays.asList(arr1));
 
 al.addAll(Arrays.asList(arr2));
 
 Object[] ab=al.toArray();
 
 System.out.println(Arrays.toString(ab));
 
			
	}

}
