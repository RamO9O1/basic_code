import java.util.Scanner;

class OddEven {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		a.close();
		if (b % 2 == 0) {
			System.out.println("Even number : " + b);
		} else {
			System.out.println("Odd number : " + b);
		}
	}
}