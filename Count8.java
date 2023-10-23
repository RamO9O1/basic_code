public class Count8 {
    public static void main(String[] args) {
        int a = 1000;
        int count = 0;
        while (a > 0) {
            if (a % 8 == 0 && a % 10 == 8) {
                count++;
            }
            a--;
        }
        System.out.println("The count is: " + count);
    }
}
