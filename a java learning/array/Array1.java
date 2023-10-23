class Array1 {

    public static void main(String[] args) {
        int y = 0;
        int count = 0;
        int j = 0;

        int[] a = { 2, 1, 4, 35, 6, 7, -5, 356, 0 };
        int[] bl = new int[a.length - 2];
        for (int i = 0; i < a.length; i++) {

            count++;
            int g = a[y];
            // System.out.println(g + "df");
            int h = a[(++y)];
            // System.out.println(h + "hj");
            int jk = a[(++y)];
            // System.out.println(j + "ty");
            int k = (g > jk ? g : jk);
            // System.out.println(k);
            int b = k > h ? k : h;
            for (; j < i + 1; j++) {
                bl[j] = b;
            }

            if (count == a.length - 2) {
                break;
            }
            y = count;

        }
        for (int i = 0; i < bl.length; i++) {
            System.out.print(bl[i] + " ");
        }
    }
}