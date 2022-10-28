package javaPraticeProgram1;

public class PrintVowelsAndCountofEachVowels {
public static void main(String[] args) {
	
	
	
	String str="anweshandeshrikhande";
	
	str=str.replace(" ", "");
	
	int fre[]=new int[str.length()];
	
	char ch[]=str.toCharArray();
	//Map<Character, Integer> map=new HashedMap<Character, Integer>();
	//int count=0;
	   for(int i=0;i<ch.length;i++) {
		fre[i]=1;
		//count=0;
	
		for(int j=i+1;j<ch.length;j++)
		{
			
			if(ch[i]==ch[j]) {
				
				fre[i]++;
			ch[j]='0';
		}}}
		for(int i=0;i<fre.length;i++) {
	
if(ch[i]!=' '&& ch[i]!='0') {
	
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
		
		System.out.println(ch[i]+"  "+fre[i] );
	}
	
	
	
}
}
	
	
	   
}
	
}
