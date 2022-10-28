package javaPraticeProgram1;

public class LargestSmallestNumberInArray {

	
	
	public static void main(String[] args) {
	
		int arr[]= {10,9,16,18,23,54,1};
		
		int small=arr[0];
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
			max=arr[i];	
		}else if(arr[i]<small)
		{
			small=arr[i];
		}	
		}
		System.out.println("Maximum number = "+max);
		
		System.out.println("Minimum number = "+small);
		
	}
}
