import java.util.*;

public class RohitQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        // int sum = 0;
        String ab = "";
        while (a > 0) {
            int rem = a % 10;

            ab += rem;

            a /= 10;
        }
        System.out.println(ab);
    }
}
