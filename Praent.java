public class Praent
{
	public void m1()
	{
		System.out.println("Praent method");
	}
	public static void main (String [] args)
	{
		
		int a = 12556;
		int b = 246786;
		System.out.println("sum"+a+b+b);
	}
}

class Child extends Praent
{
	public void m23()
	{
		System.out.println("Child method");
	}
	public static void main (String [] args)
	{
		Child c = new Child();
		c.m1();
		c.m23();
	}
	
}