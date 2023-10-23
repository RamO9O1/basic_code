class Pattern2{
	public static void main(String[] args){
		int n=5;
		int a=n;
		int oddCount=n;
		int evenCount=n-1;
		for(int i = 1; i<=n ; i++){
			int count=i;
			for(int j=1;j<=a-1;j++){
				System.out.print(" ");
			}
			a--;
			if(i%2==0){
				for(int k=1;k<=2*n-1;k++ ){
					for(int l=evenCount;l>0;l--){
						if(count>0 && l%2==1){
							System.out.print("*");
							count--;
						}else{
							System.out.print(" ");
						}
					}
					System.out.print(" ");
					for(int l=evenCount;l<=2*n-1;l++){
						if(count>0 && l%2==1){
							System.out.print("*");
							count--;
						}else{
							System.out.print(" ");
						}
					}
				}
			}else{
				for(int k=1;k<=2*n-1;k++ ){
					for(int l=oddCount;l>0;l--){
						if(count>0 && l%2==0){
							System.out.print("*");
							count--;
						}else{
							System.out.print(" ");
						}
					}
					for(int l=oddCount;l<=2*n-1;l++){
						if(count>0 && l%2==0){
							System.out.print("*");
							count--;
						}else{
							System.out.print(" ");
						}
					}
				}	
			}
			System.out.println();
		}
	}
}