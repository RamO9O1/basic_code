import java.util.Scanner;

class CheckVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		sc.close();
		char a = sc.nextLine().charAt(0);
		String d = (a == 'a' || a == 'i' || a == 'o' || a == 'e' || a == 'u') ? "Vowel" : "Not Vowel";
		System.out.println(d);
	}
}