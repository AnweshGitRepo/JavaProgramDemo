package javaPraticeProgram;

import java.util.Arrays;

public class CalculateAvargeOfAllArrayElement {
public static void main(String[] args) {
	
int ar[]= {12,2,4,5,5,12,3,7};
int sum=0;
for(int i=0;i<ar.length;i++) {
	
	 sum=sum+ar[i];	
}

    double avg=sum/ar.length;
	System.out.println(avg);
	
}

}