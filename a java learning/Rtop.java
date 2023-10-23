import java.util.Scanner;

class Rtop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ammount");
		float r = sc.nextFloat();
		sc.close();
		int e = (int) r;
		float c = r * 100;
		System.out.println("Rupee = " + e + "\nPaisa = " + c);
	}
}
