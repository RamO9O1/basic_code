import java.util.*;

public class Arrayclass {
    public static void main(String[] args) {
        int a[] = { 2, 2, 1, 1, 1, 2, 2 };
        // int half_len = a.length / 2;
        // System.out.println(half_len);
        int index = 0, count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                index = i;
                count = 1;
            }
        }
        int size = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[index]) {
                size++;
            }
        }
        // System.out.println(index + " index");
        if (size >= a.length / 2) {
            System.out.println(a[index]);
        } else {
            System.out.println("no majority element");
        }

    }
}
