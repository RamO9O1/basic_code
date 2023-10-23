import java.util.Scanner;

class AramstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        sc.close();
        String str = "" + a;
        int s = 0;
        while (a > 0) {
            int b = a / 10;
            int f = a % 10;
            s = (int) (Math.pow(f, str.length()) + s);
            a = b;
            System.out.println(s);
        }
        System.out.println("The result is anagram ;" + s);
    }
}