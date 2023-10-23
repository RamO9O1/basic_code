import java.util.Scanner;
class Sum
{
	public static void main(String [] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
	  int i = sc.nextInt();
	  int num = 0;
 		for(int j = 0 ; j<=i; j++)
		{
		  num+=j;
		}
	
			System.out.println("sum = "+num);

	}

}