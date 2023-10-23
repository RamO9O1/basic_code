import java.util.Scanner;
class Resnum
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = sc.nextInt();
		int d= 0, r;
		while(a!=0)
		{
		 r=a%10;
		 d = d*10+r;
		 a/=10;
		 }
		System.out.println("Reverse of the number: "+d);
		 
		 
		
	}
}