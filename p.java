class P
{
	public static void m1()
	{
	   System.out.println("Parent");
	}
}
class C extends P
{
	public static void m2()
	{
		System.out.println("Child");
	}
}

class Testt
{
   public static void main(String [] args)
   {
     P p = new P();
	 p.m1();
	 C c = new C();
	 c.m1();
	 c.m2();
	 P p2 = new C();
	 p.m1();
	}

}
	 
   