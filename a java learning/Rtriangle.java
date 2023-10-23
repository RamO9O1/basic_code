
/*Rtriangle*/
import java.util.Scanner;

class Rtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente rthe hypotunise side a");
        int a = sc.nextInt();
        System.out.println("Ente rthe -base side b");
        int b = sc.nextInt();
        System.out.println("Ente rthe perpendicular side c");
        int c = sc.nextInt();
        sc.close();

        if (a + b > c && b + c > a && c + a > b) {
            int x = (a * b) / 2;
            System.out.println("Area of the triangle " + x);
        } else {
            System.out.println("It is not a triangle");
        }

    }
}
