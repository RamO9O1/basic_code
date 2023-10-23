import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char a = sc.next().charAt(0);
        sc.close();
        if (a >= 'a' && a <= 'z') {
            System.out.println("this is a Lower case alphabet :" + a);
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("this is a Upper case alphabet :" + a);
        } else {

            System.out.println("this is not an alphabet :" + a);

        }

    }
}
