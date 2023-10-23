import java.util.Scanner;

public class PrintArm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int t = sc.nextInt();
        sc.close();
        int a = 0;
        while (a <= t) {

            String str = "" + a;
            int s = 0;

            while (a > 0) {
                int b = a / 10;
                int f = a % 10;
                s = (int) (Math.pow(f, str.length()) + s);
                a = b;

            }
            if (s == a) {
                System.out.println(s + " ");
            } else {

            }
            a++;
        }
    }
}
