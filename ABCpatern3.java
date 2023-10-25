public class ABCpatern3 {
    public static void main(String[] args) {
        char st = 'F';
        int row = 12;
        int div = row / 2;
        row++;
        boolean in = true;
        char temp = st;
        for (int i = 0; i < row; i++) {
            char temp1 = temp;
            for (int j = 0; j < div; j++) {
                System.out.print((temp1--) + " ");
            }
            if (div > 0 && in) {
                div--;
                temp--;
            } else {
                in = false;
                div++;
                ++temp;
            }
            if (div != 0)
                System.out.println();

        }
    }
}
