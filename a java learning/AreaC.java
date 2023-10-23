import java.util.Scanner;

class AreaC {
	public static void main(String[] args) {
		System.out.println("Enter the Radius of the Circle");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		sc.close();
		double a = 3.14 * r;
		System.out.println("Area of the Circle = " + a);
	}
}