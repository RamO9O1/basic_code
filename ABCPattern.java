public class ABCPattern {
    public static void main(String[] args) {
        int a = 97;
        int t = 6;
        for (int i = 0; i < t; i++) {

            int b = a;
            int n = b;
            for (int j = b; j <= 'f'; j++) {
                char c = (char) b;
                System.out.print(c + " ");
                if (c == 'f') {
                    break;
                }
                b++;
            }
            b--;
            for (int j = 'f'; j >= n; j--) {
                // System.out.print("##" + b + "@@");

                char c = (char) b;
                if (c == 'e' && i == t - 1) {
                    break;
                }
                System.out.print(c + " ");
                if (c == 'a' + i) {
                    break;
                }
                b--;

            }
            System.out.println();
            a++;
        }
    }
}
