public class PrintPalimdrome {
    public static void main(String[] args) {
        int a = 500;
        int i = 1;
        int countv = 0;
        while (i <= a) {
            int count = 0;
            int n = i;
            int s = i;
            while (s > 0) {
                count++;
                int b = s % 10;
                int u = s / 10;
                s = u;

            }
            int r = i;
            int res = 0;
            int county = 0;
            while (r > 0) {
                county++;
                int countx = county;
                int b = r % 10;
                int u = r / 10;
                r = u;
                int e = 1;
                while (countx < count) {
                    e = e * 10;
                    countx++;
                }
                res = res + b * e;
                // System.out.println(res);
            }
            if (res == n) {
                System.out.println(n + " is a Palimdrome NUMBER");
                countv++;
            }
            i++;
        }
        System.out.println("Total number of Palimdrome number upto 500 is: " + countv);
    }
}
