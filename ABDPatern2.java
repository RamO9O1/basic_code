public class ABDPatern2 {
    public static void main(String[] args) {
        int a = 97;
        int t = 8;
        for (int i = 0; i < t; i++) {
            int b = a;
            for (int j = 0; j < 5; j++) {
                char c = (char) b;
                System.out.print(c + " ");
                b++;
            }
            a++;
            System.out.println();
        }
    }
}
