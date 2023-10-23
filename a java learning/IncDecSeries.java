import java.util.Scanner;

public class IncDecSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of series you want: ");
        int t = sc.nextInt();
        System.out.println("You series is below: ");
        sc.close();
        int c = 1;
        for (int i = 0; i < t; i++) {

            for (int j = 0; j < 3; j++) {
                if (i % 2 == 0) {
                    System.out.print(c + " ");
                    c++;
                } else {
                    System.out.print(c + " ");
                    c--;
                }

            }

            System.out.println();
            if (i % 2 == 0) {
                c += 2;
            } else {
                c += 4;
            }
        }
    }
}
