

public class helloworld
{
	public static void main(String[] args)
	{
		System.out.println("Summing 0.5 n times");
		for (long n = 10000L; n < Integer.MAX_VALUE; n *= 10)
		{
			float sum = 0.0f;
			float x = 0.5f;

			for(long i = 0; i < n; i++)
			{
				sum += x;
			}
			System.out.println("n = " + n + "\tsum = " + sum);
		}

		System.out.println("\nSumming 0.1 n times");
		for (long n = 10000L; n < Integer.MAX_VALUE; n *= 10)
		{
			float sum = 0.0f;
			float x = 0.1f;

			for(long i = 0; i < n; i++)
		{
			sum += x;
		}
			System.out.println("n = " + n + "\tsum = " + sum);
		}

	}
}
