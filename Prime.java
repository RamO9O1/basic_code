import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int i = sc.nextInt();
		
		checkPrime(i);
	}
	private static void checkPrime(int i)
	{
		int count = 0;
		if(i<2)
		{
			System.out.println("This is not a Prime Number."+i);
		}
		for(int j = 1;j<i; j++)
		{
			if(i%j==0)
			count+=1;

		}
		
		if(count>2)
		{
			System.out.println("This is not a Prime Number."+i);
		}
		else
		{
			System.out.println("This is a Prime Number."+i);
		}
       }
}