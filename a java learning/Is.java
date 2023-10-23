import java.util.Scanner;
class Is 
{
	public static void m1()
	{
		System.out.println("hello : ");
		for(int i = 1; i <= 11 ; i++)
		{
			int a = 3;
			int b = a*i;
			System.out.println("3 * "+i+" = "+b);
		}
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number less then 12");
		int a = sc.nextInt();
		sc.close();
		while(a<12)
		{
			a++;
			System.out.println(a);
		}
		m1();
		
	}
}
