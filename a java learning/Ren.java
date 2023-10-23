class MyThread extends Thread
{
	
}
class Ren
{
	public static void main(String[]args)
	{
		ThreadGroup d = new ThreadGroup("Parent Group");
		Thread c1 = new Thread(d,"Child Thread");
		Thread c2 = new Thread(d,"Child Thread");
		c1.start();
		c2.start();
		d.list();
		System.out.println(Thread.currentThread().getName());
	}
}
