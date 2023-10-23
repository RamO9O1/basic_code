import java.util.Scanner;

public class PalimdronIsNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        sc.close();
        int n = a;
        int count = 0;
        int res = 0;
        int v = a;
        sc.close();
        while (v > 0) {
            int b = v % 10;
            count++;
            int c = v / 10;
            v = c;

        }
        int countx = 0;
        while (a > 0) {
            int b = a % 10;
            countx++;
            int count1 = countx;
            int c = a / 10;
            a = c;
            int e = 1;
            while (count1 < count) {
                e = e * 10;
                count1++;
            }
            res = res + b * e;
        }
        if (res == n) {
            System.out.println("It is a palimdrome Number : " + n);
        } else {
            System.out.println("It is not a palimdrome Number : " + n);
        }
    }
}
