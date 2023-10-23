import java.util.Scanner;
class Suminrange
{
     public static void main(String [] args)
	{
		System.out.println("PLEASE ENTER FIRST NUMBER WHICH SHOULD BE LESS THAN THE SECOND NUMBER");
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = sc.nextInt();
		System.out.println("Enter the second number");
		int y = sc.nextInt();
		long z= ((y*(y+1))/2)-((x*(x+1))/2);
		System.out.println("Sum = "+z);
	}
}