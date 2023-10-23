import java.util.Scanner;

public class Fbig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        int e = (a > b) ? a : b;
        int f = (e > c) ? e : c;
        int g = (f > d) ? f : d;
        String d1 = "Big number" + g;
        System.out.println(d1);
    }
}
