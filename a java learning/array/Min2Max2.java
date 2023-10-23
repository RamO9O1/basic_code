public class Min2Max2 {
    public static void main(String[] args) {
        int[] a = { 1, 4, 6, 5, 8, 5, 2, 9484, 879, 0, 61 };

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                int v = 0;
                if (a[i] > a[j]) {
                    v = a[i];
                    a[i] = a[j];
                    a[j] = v;

                }
            }
            System.out.println(a[i]);
        }
        System.out.println(a[1] + " -2nd Minimum" + "\n" + a[a.length - 2] + " -re2nd Maximun");
    }
}
