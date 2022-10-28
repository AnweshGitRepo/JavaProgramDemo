package javaPraticeProgram;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class CharacterOccurenceNew1 {

	public static void main(String[] args) {
		
	

	String str="anweshshr ik handeaa";
	
	
	str=str.replace(" ", "");
	
	//int fre[]=new int[str.length()];
	
	char ch[]=str.toCharArray();
	Map<Character, Integer> map=new HashedMap<Character, Integer>();
	int count=0;
	
	
	for(int i=0;i<ch.length;i++) {
		
		count=0;
	
		for(int j=0;j<ch.length;j++)
		{
			
			if(ch[i]==ch[j]) {
				
				count++;
		}}
		
		
	map.put(ch[i], count);
	}
	System.out.println(map);
	
	}
}
