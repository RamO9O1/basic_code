import java.util.Scanner;

public class EachNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        sc.close();
        int count = 0;
        int sum = 0;
        while (a > 0) {
            int b = a % 10;
            count++;
            System.out.println(b);
            int c = a / 10;
            a = c;
            sum = sum + b;
        }
        System.out.println("The sum of Digits is: " + sum);
        System.out.println("The Count of Digits is: " + count);
    }
}
