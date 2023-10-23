class Tent
{
	public static void main (String [] args)
	{
		m1();
		System.out.println("main");
	}
	static void m1()
	{
		int y = 0;
		int s = 2;
		for(int i = 0;i<=10;i++)
		{
		   y = s + i;
		   System.out.println("result of loop"+ y);
		}  
	}
}