import java.util.Scanner;

public class StrRes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String str = sc.nextLine();
        sc.close();
        String res = "";
        for (int i = 0; i < str.length(); i++) {

            res = str.charAt(i) + res;
            System.out.println(res);

        }
        System.out.println(res);
        System.out.println(res.equals(str));
    }
}
