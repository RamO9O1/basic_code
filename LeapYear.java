
//Find the Leap Year 
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year :");
        int a = sc.nextInt();
        sc.close();
        if (a % 400 == 0) {
            System.out.println("This is a Leap Year :" + a);
        } else if (a % 4 == 0) {
            System.out.println("This is a Leap Year :" + a);
        } else {
            System.out.println("This is a not Leap Year :" + a);
        }

    }
}