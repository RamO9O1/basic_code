import java.util.*;

public class ArrayClass_sorting {
    public static void main(String[] args) {
        String[] a = new String[10];
        char c = 'a';
        for (int i = 0; i < a.length; i++) {

            a[i] = (char) (c++) + "";
        }
        for (String a1 : a) {
            System.out.println(a1);
        }
        System.out.println();
        Arrays.sort(a);
        for (String a1 : a) {
            System.out.println(a1);
        }

    }
}
