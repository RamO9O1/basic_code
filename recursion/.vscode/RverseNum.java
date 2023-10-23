
import java.util.Scanner;

public class RverseNum {
    static int dig;
    static int countx;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int x = sc.nextInt();
        sc.close();
        count(x);
        reverse(x);
    }

    public static void count(int n) {
        if (n > 0) {
            countx++;
            count(n / 10);
        }
    }

    public static void reverse(int n) {

        if (n > 0) {
            int p = n % 10;
            int e = 1;
            for (int i = 0; i < countx - 1; i++) {
                e = e * 10;
            }
            countx--;
            dig = dig + e * p;
            reverse(n / 10);
        } else {
            System.out.println("the reverse of number: " + dig);
        }
    }
}
