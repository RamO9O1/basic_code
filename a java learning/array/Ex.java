class Ex {
    public static void main(String[] args) {
        int x = 1534236469;
        reverse(x);
    }

    public static int reverse(int x) {
        int sum = 0;
        int p = x;
        if (x >= (int) (Math.pow(-2, 31)) && x <= (int) (Math.pow(2, 31)) - 1) {
            int y = x;
            int u = x;
            int count = 0;
            while (y > 0) {
                count++;
                y = y / 10;
            }
            if (p < 0) {
                y = -y;
                while (y > 0) {
                    count++;
                    y = y / 10;
                }
            }

            for (int i = 0; i < count; i++) {
                int o = u % 10;

                int e = 1;
                for (int j = 0; j < count - 1 - i; j++) {
                    e = e * 10;
                }
                sum = sum + o * e;
                u = u / 10;
            }
        }
        if ((int) (Math.pow(-2, 31)) > sum || (int) (Math.pow(2, 31)) - 1 < sum) {
            return 0;
        }
        if (sum % 10 == 0) {
            sum = sum % 10;

            return sum;

        }
        if (p < 0) {

            return sum;
        }
        return sum;
    }
}