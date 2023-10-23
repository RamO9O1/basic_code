import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        int n = 9;
        int[] a = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

        Integer temp = new Integer(10);
        Integer temp1 = new Integer(10);
        int ann = 0, dv = 654;

        System.out.println(ann + "  " + dv);
        System.out.println(temp == temp1);
        System.out.println(temp.equals(temp1));
        for (int i = 0; i < n; i++) {
            int k = n - 1 - i;
            for (int j = i + 1; j > i; j--) {
                for (; k > i; k--) {
                    System.out.print("");
                }
                System.out.print("#");
                k = 0;
            }
            System.out.println("");
        }
    }

}
