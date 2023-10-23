import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        sc.close();
        int u = a;
        int sum = 0;
        while (a > 0) {
            int b = a % 10;
            int c = a / 10;
            int y = b;
            a = c;
            int fact = 1;
            while (b > 0) {
                fact = fact * b;
                b--;
            }
            System.out.println(y + "!= " + fact);
            sum += fact;
        }
        if (sum == u) {
            System.out.println("It is a strong num: " + u);
        } else {
            System.out.println("It is not a strong num: " + u);
        }
    }
}
