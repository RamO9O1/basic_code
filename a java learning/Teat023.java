public class Teat023 {
    public static void main(String[] args) {
        int n = 4;
        float a = 2;
        float b = 3;
        float powa = 1;
        float powb = 1;
        float suma = 0;
        float sumb = 0;
        float sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                powa = a / b;
                suma = suma + powa;

            } else {
                powb = a / b;
                sumb = sumb + powb;
            }
            a = a + 2;
            b = b + 2;
        }
        sum = suma - sumb;
        powa = 0;
        for (int i = 0; i < n; i++) {
            powa = powa * 10;
        }
        System.out.println(sum / powa);

    }
}
