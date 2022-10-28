package javaPraticeProgram;

public class PrintCommenCharacterInString {

	// Print Common Character In String 
	public static void main(String[] args) {
		
		String s="anweshaxxw";
		int count=1;
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			count=1;
			for(int j=i+1;j<s.length();j++) {
					
				if(ch[i]==ch[j]&& ch[j]!=0){
					count++;
					ch[j]=0;
				//	System.out.println(ch[j]);
				}
			}	
			if(count>1 && ch[i]!=0) {
				System.out.println(ch[i]);
			}
		}
		

	}

}
