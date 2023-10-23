import java.util.Scanner;

class Checkprime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		sc.close();
		if (a == 2 || a == 3 || a == 5) {
			System.out.println("Prime number");
		} else if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0) {
			System.out.println("not a prime number");
		} else {
			System.out.println("prime number");
		}

	}
}