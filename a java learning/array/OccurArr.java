public class OccurArr {
    public static void main(String[] args) {
        int[] a = { 2, 1, 2, 7, 6, 7, -5, 2, 0 };

        for (int i = 0; i < a.length; i++) {
            int b = a[i];
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                int c = a[j];
                if (b == c) {
                    count++;
                    a[j] = 0;
                }
            }
            a[i] = 0;
            System.out.println(b + " of count " + count);

        }
    }
}
