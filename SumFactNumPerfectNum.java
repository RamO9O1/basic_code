import java.util.Scanner;

public class SumFactNumPerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        sc.close();
        int sum = 0;
        int i = 1;
        while (i <= (a / 2)) {
            int fact = 0;
            if (a % i == 0) {
                fact = i;
            }
            sum += fact;
            i++;
        }
        System.out.println("The sum of each Factor of " + a + " is " + sum);
        if (sum == a) {
            System.out.println("It is a Strong Number: " + a);
        } else {
            System.out.println("It is not a Strong Number: " + a);
        }
    }
}
