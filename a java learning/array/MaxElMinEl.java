public class MaxElMinEl {
    public static void main(String[] args) {
        int[] a = { 2, 1, 4, 35, 6, 7, -5, 356, 0 };

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
        System.out.println(a[0] + " min" + "\n" + a[a.length - 1] + " max");

    }
}
