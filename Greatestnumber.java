import java.util.Scanner;
class Greatestnumber
{
	public static void main(String [] args)
  	{
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter the first number");
		int i = sc.nextInt();
		System.out.println("enter the second number");
            int u = sc.nextInt();
		System.out.println("enter the third number");
		int o = sc.nextInt();
		int z  = i>u?i:u;
		int y = z>o?z:u;
		 System.out.println("The largest is = "+y);
		
	}
}
