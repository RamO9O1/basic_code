public class CountElement {
    public static void main(String[] args) {
        int[] a = { 1, 1, 3, 4, 4, 3, 1, 5, 5, 7, 7, 8, 2, 3, 2, 4, 5, 7, 7, 4 };
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] != 0) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = 0;
                    }
                }
            }
            if (a[i] != 0)
                System.out.println(a[i] + " has a count of " + count);
            a[i] = 0;
        }
    }
}
