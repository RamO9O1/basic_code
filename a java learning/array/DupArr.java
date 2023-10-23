class DupArr{
	public static void main(String[] args){
	    int [] a ={1,2,3,2,4,5,3,1,3,56,7,4,2,1,4,5,1,2,1,4,6,7,8,9,96,6,7,7,1,6};
			for(int i = 0;i<a.length;i++)
		{
			   for(int j = i+1;j<a.length;j++)
			   {
			     int ab = 0;
				 if(a[i]>a[j])
				 {
					 ab=a[i];
					 a[i]=a[j];
					 a[j]=ab;
				 }
			   }
		}
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+", ");
		}
		System.out.println();
		for(int i = 0;i<a.length;i++)
		{
			int count = 1;
			for(int j = i+1;j<a.length;j++)
			{
			 if(a[i]!=0)
			 {
				 if(a[i]==a[j])
				{
				 count++;
				 a[j]=0;
			    }
			 }
			}
			if(count>1)
	     	{
				System.out.println(a[i]+" has a duplicate having count of "+count);
		    }
		}
		
	
		
	}
}