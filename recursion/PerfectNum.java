public class PerfectNum {

    public static void main(String[] args) {
        int a = 6;
        if (findPerfect(a)) {
            System.out.println("Perfect Num");
        } else {
            System.out.println("Not  Perfect Num");
        }
    }

    static int i = 1;
    static int sum;

    public static boolean findPerfect(int n) {
        int y = n;
        if (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
            findPerfect(n);
        }
        if (y == sum) {
            return true;
        } else {
            return false;
        }
    }
}
