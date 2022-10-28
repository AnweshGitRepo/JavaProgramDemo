package javaPraticeProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class FirstNonRepeatedCharSecond {
public static void main(String[] args) {
	
	String s="googlemap";

	Map<Character, Integer>count=new HashMap<Character, Integer>();
	int length ;
   
    length= s.length();  // Scan string and build hash table
    for (int i=0;i < length;i++)
    {
      char  ch = s.charAt(i);
        if(count.containsKey(ch))
        {
            // increment count corresponding to ch
        	count.put(  ch ,  count.get(ch) +1 );
        }
        else
        {
        	count.put( ch , 1 ) ;
        }
    }
	/*
	 * for(Entry<Character,Integer> entry: count.entrySet()) { if(entry.getValue()
	 * == 1) System.out.println(entry.getKey()); }
	 */
   
    for(int i=0;i<s.length();i++) {
    	
    	if(count.get(s.charAt(i))==1) {
    		System.out.println(s+"  =   "+s.charAt(i));
    		break;
    	}
    	
    }
    
}
		
	
}

