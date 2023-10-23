class Control
{
	static
	{
		m2();
		System.out.println("block");
	}
	static int e = 15;
	public static void m2()
	{
		System.out.println(e);
	}
	public static void main (String[]args)
	{
		Control c = new Control();
		System.out.println("main");
	}
	int x = 10;
	{
	System.out.println("constractor");
	}
	

}