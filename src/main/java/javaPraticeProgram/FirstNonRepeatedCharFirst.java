package javaPraticeProgram;

public class FirstNonRepeatedCharFirst {

	public static void main(String[] args) {
	
		
		 String inputStr ="googlemap";

	        for(char i :inputStr.toCharArray()){
	        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
	            System.out.println("First non-repeating character is: "+i);
	            break;
	        }
	        }
		

	}

}
