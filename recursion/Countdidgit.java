
/**
 * Countdidgit
 */
import java.util.Scanner;

public class Countdidgit {
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int x = sc.nextInt();
        sc.close();
        count(x);
    }

    public static void count(int n) {
        if (n > 0) {
            count++;
            count(n / 10);
        } else {
            System.out.println("total Digit is: " + count);
        }
    }
}