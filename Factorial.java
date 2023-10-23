import java.util.*;

class Factorial {

    public static int m1(int x) {
        if (x == 0) {
            return 1;
        }
		System.out.print(x+"*");
        return x * m1(x - 1);
		//1*2*3
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++){
			fact=fact*i;
		}
        System.out.println("Fact " + fact);
    }
}
