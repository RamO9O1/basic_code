class Binary
{
	public static void main(String[] args)
	{
		int num=10;
		StringBuffer sb=new StringBuffer();
		while(num>0){
			sb.append(num%2);
			num=num/2;
		}
		sb.reverse();
		System.out.println(sb);
	}
}