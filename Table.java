import java.util.Scanner;
class Table
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int i = sc.nextInt(); 
	System.out.println("The table of "+i);
	for(int y = 1; ; y++)
	{
		int u = 1;
		if(y==11)
		break;
		u = i*y;
		System.out.println(i+"*"+y+"="+u);
	}
	}
}