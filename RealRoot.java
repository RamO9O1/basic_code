import java.util.Scanner;

//To fond the roots of Eq.
public class RealRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number a");
        int a = sc.nextInt();
        System.out.println("ENter the number b");
        int b = sc.nextInt();
        System.out.println("ENter the number c");
        int c = sc.nextInt();
        sc.close();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            double x = ((-b) + (Math.pow(d, 0.5))) / (2 * a);
            System.out.println("This equation has Real and Distinct root: " + x);
            double p = ((-b) - (Math.pow(d, 0.5))) / (2 * a);
            System.out.println("This equation has Real and Distinct root: " + p);
        } else if (d == 0) {
            double x = (-b) / (2 * a);
            System.out.println("This equation has Real and Distinct root: " + x);
        } else {
            System.out.println("This equation has not Real root");
        }
    }
}
