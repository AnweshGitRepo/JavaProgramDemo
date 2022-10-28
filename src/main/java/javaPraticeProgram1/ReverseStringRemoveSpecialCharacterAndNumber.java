package javaPraticeProgram1;



public class ReverseStringRemoveSpecialCharacterAndNumber  {
public static void main(String[] args) {

	String str="Test@java1";
	//str = str.replaceAll("[]","");  
	String ss="";
	
	for(int i=str.length()-1;i>=0;i--) {
		if (str.charAt(i)>64 && str.charAt(i)<=122) {
			
		ss=ss+str.charAt(i);
			
		}
	}
	
	System.out.println(ss);
	
}
}
