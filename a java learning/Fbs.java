class Fbs
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i = 0; i<10; i++)
		{
			int c = a+b;
			System.out.print(c+" ");
			a= b;
			b=c;		
		}
		System.out.println();
		System.out.print("10th Term in fibnocci "+solve(10));
	}
	public static int solve(int a){
		if(a==0){
			return 0;
		}
		if(a==1){
			return 1;
		}
		return solve(a-1)+solve(a-2);
	}
}