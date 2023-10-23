import java.util.Scanner;
class Tillsqr
{
	public static void main(String [] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number");
	  int i = sc.nextInt();
	  int u = 0;
	  for(int y= 1 ; y<=i ; y++)
	  {
		 System.out.println(y*y);
	  }
	}
}