import java.util.Scanner;
class Oodeven
{
	public static void main(String [] args)
	{
	//Notepad++
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	 int i = sc.nextInt();
	 if(i!=0 && i%2==0)
	 {
		System.out.println("Even Number = "+i);
		}
	else if(i==0)
		{
			 System.out.println("The Number is Zero.");
		}
	else
		{
			 System.out.println("Odd number = "+i);
		}
	}

}