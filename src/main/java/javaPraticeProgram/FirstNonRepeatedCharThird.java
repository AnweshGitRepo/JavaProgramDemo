package javaPraticeProgram;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatedCharThird {

	public static void main(String[] args)
    {  
        String str ="googllecom";
          
	        List<Character> nonRepeatingChars = new ArrayList();
	       
	        for(int i=0; i < str.length(); i++) {
	            char letter = str.charAt(i);
				
	            if(nonRepeatingChars.contains(letter)) {
	                nonRepeatingChars.remove((Character) letter);  
	            }
	            else {
	                nonRepeatingChars.add(letter);
	            }
	        } 
	        System.out.println(nonRepeatingChars.get(0));
	    }

	    
}
