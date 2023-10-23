public class Sum7 {
    // upto 500 end by 7 and / by 7
    public static void main(String[] args) {
        int a = 500;
        int sum = 0;
        while (a > 0) {
            if (a % 7 == 0 && a % 10 == 7) {
                sum = sum + a;
            }
            a--;
        }
        System.out.println("The sum is: " + sum);
    }
}
