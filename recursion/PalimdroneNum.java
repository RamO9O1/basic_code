import java.util.Scanner;

public class PalimdroneNum {

    static int dig;
    static int countx;
    static int v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int x = sc.nextInt();
        v = x;
        sc.close();
        count(x);

        if (palNum(reverse(x))) {
            System.out.println("It is a palimdrome Number.");
        } else {
            System.out.println("It is not.... a palimdrome Number.");
        }
    }

    public static void count(int n) {
        if (n > 0) {
            countx++;
            count(n / 10);
        }
    }

    public static int reverse(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n > 0) {
            int p = n % 10;
            int e = 1;
            for (int i = 0; i < countx - 1; i++) {
                e = e * 10;
            }
            countx--;
            dig = dig + e * p;
            reverse(n / 10);
        }
        return dig;
    }

    public static boolean palNum(int n) {
        if (v == n)
            return true;

        return false;
    }
}
