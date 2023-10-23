import java.util.Scanner;

class CheckChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		int a = sc.nextLine().charAt(0);
		System.out.println(a);
		sc.close();
		String d = (a >= 65 && a <= 91) || (a >= 97 && a <= 123) ? "Alphabet" : "Not Alphabet";
		System.out.println(d);

	}
}