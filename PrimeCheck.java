class PrimeCheck {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (checkPrime(i)) {
                count++;
            }
        }
		   System.out.println("Total Prime nUm count; " + count);
    }

    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
