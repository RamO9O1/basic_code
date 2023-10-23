
//biggest number in 3
import java.util.*;

class BigNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();
        System.out.println("Enter the number");
        int c = sc.nextInt();
        sc.close();

        if (a > b && a > c) {
            System.out.println("Big num is :" + a);
        } else if (b > a && b > c) {
            System.out.println("Big num is :" + b);
        } else {
            System.out.println("Big num is :" + c);
        }

    }
}