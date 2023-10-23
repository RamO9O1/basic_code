import java.util.Scanner;
class Tarea
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first side");
	int a = sc.nextInt();
	System.out.println("enter the second side");
	int b = sc.nextInt();
	System.out.println("enter the third side");
	int c = sc.nextInt();
	int s = (a+b+c)/2;
	int q = (s*(s-a)*(s-b)*(s-c));
	System.out.println("The area of Triangle = "+Math.sqrt(q));
	
	}
}	