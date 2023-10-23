import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args) {
        boolean[] prime = new boolean[Integer.MAX_VALUE - 1000000000];
        prime = getPrime(prime);
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a number you want to check: ");
        int number = sc.nextInt();
        if (prime[number] == true) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        sc.close();
    }

    public static boolean[] getPrime(boolean[] prime) {
        int b = prime.length;
        for (int i = 0; i < b; i++) {
            prime[i] = true;
        }
        for (int j = 2; j * j < b; j++) {
            if (prime[j] == true) {
                for (int k = j * j; k < b; k += j) {
                    prime[k] = false;
                }
            }
        }
        return prime;
    }
}
