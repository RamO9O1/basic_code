public class FPyramid {
    public static void main(String[] args) {
        int t = 7;
        int count = 0;
        for (int i = 0; i < t - 1; i++) {
            int k = t - 1;
            int b = 'F' - count;
            for (int j = 0; j <= i; j++) {
                for (; k > i; k--) {
                    System.out.print(" ");
                }
                char c = (char) b;
                System.out.print(c + " ");
                b++;
                k = 0;
            }
            System.out.println();

            count++;
        }
    }
}
