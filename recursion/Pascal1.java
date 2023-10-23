import java.util.*;

public class Pascal1 {
    public static int fact(int num) {
        int pow = 1;
        while (num > 0) {
            pow *= num;
            num--;
        }
        return pow;
    }

    public static void main(String[] args) {
        List<List<Integer>> li = new ArrayList<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            int k = 0;
            List<Integer> li1 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int row = fact(i);
                int col = fact(k);
                int diff = fact(Math.abs(i - k));
                int ans = row / (col * diff);
                li1.add(ans);
                k++;
            }
            li.add(i, li1);
        }
        System.out.println(li);
        li.forEach(System.out::println);

    }
}
