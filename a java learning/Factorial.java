import java.util.*;

class Factorial {

    public static int m1(int x) {
        if (x == 0) {
            return 1;
        }
        return m1(x) * m1(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println("Fact " + m1(a));
    }
}
