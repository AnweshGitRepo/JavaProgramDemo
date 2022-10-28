package javaPraticeProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFindMinNumber {

	public static void main(String[] args) {
		
ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(40);
		al.add(60);
		al.add(70);
		al.add(30);
		al.add(19);
		al.add(25);
		al.add(23);	
		int minimum = al.get(0);
		int maximum=al.get(0);
		
		for(int i=0;i<al.size();i++) {
	    
			if(minimum>al.get(i)) {
	
			minimum=al.get(i);	
			
		    }	
		  }
		System.out.println(minimum);
		
	}
}
