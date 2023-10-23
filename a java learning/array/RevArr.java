public class RevArr {
    public static void main(String[] args) {
        int[] a = { 2, 1, 4, 35, 6, 7, -5, 356, 0 };
        int[] b = new int[a.length];
        int y = a.length;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[--y];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
