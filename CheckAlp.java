import java.util.Scanner;

//to check alphabet
public class CheckAlp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char a = sc.next().charAt(0);
        sc.close();
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            System.out.println("This is an alphabet :" + a);
        } else {
            System.out.println("This is not an alphabet :" + a);
        }
    }
}
