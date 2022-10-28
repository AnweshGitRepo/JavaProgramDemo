package javaPraticeProgram;

public class CommonDigitsPresentInTwoGivenNumbers {

	// Java program for the above approach
	

	// Function to count number of digits
	// that are common in both N and M
	public static void main(String[] args)
	{
		int N = 1234;
		int M = 3456;

		     
		
		int count = 0;

		// Stores the count of digits of N
		int freq1[] = new int[10];

		// Stores the count of digits of M
		int freq2[] = new int[10];

		// Iterate over the digits of N
		while (N > 0)
		{
			
			// Increment the count of
			// last digit of N
			freq1[N % 10]++;

			// Update N
			N = N / 10;
		}
		
		// Iterate over the digits of M
		while (M > 0)
		{
			
			// Increment the count of
			// last digit of M
			freq2[M % 10]++;

			// Update M
			M = M / 10;
		}
		
		// Iterate over the range [0, 9]
		for(int i = 0; i < 10; i++)
		{
			
			// If freq1[i] and freq2[i] both exceeds 0
			if (freq1[i] > 0 & freq2[i] > 0)
			{
				
				// Increment count by 1
				count++;
			}
			
			
			
		}
		
		System.out.println(N+"    "+M);
		
	}
}

	

