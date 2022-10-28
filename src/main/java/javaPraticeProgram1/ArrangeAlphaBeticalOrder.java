package javaPraticeProgram1;

public class ArrangeAlphaBeticalOrder {

	public static void main(String[] args) {
	
	String name="vodafone";
	
	char [] temp=name.toCharArray();
	
	for(int i=0;i<name.length();i++) {
		
		for(int j=i+1;j<name.length();j++) {
				
			if(temp[i]>temp[j]) {
				
				char c=temp[i];
				
				temp[i]=temp[j];
				
				temp[j]=c;
			}
			
		}
			
	}
	
	System.out.println(temp);
}
}
