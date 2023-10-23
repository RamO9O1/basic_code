public class MissingNumArr {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 7, 8, 6, 2 };
        int b = a.length + 1;
        int sum = (b * (b + 1)) / 2;
        for (int i = 0; i < a.length; i++) {
            sum -= a[i];
        }
        System.out.println("the missing num is " + sum);
    }
}
