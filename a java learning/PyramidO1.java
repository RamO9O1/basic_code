import java.util.Scanner;

public class PyramidO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows : ");
        int t = sc.nextInt();
        sc.close();
        System.out.println("Your Pattern: ");
        for (int i = 0; i < t; i++) {
            int k = t - 1;
            for (int j = 0; j <= i; j++) {
                for (; k > i; k--) {
                    System.out.print(" ");
                }
                System.out.print("*" + " ");
                k = 0;
            }
            System.out.println();

        }
    }
}
