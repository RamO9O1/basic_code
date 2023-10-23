public class Matrix_D {
    public static int[][] generateMatrix(int A) throws ClassNotFoundException {
        int[][] a = new int[A][A];
        int top = 0;
        int right = 0;
        int bottum = a.length - 1;
        int left = 0;
        int row = 0;
        int col = 0;
        int num = 1;
        while (true) {
            while (row == top && col < a.length) {
                a[row][col] = num++;
                col++;
            }
            col--;
            top++;
            while (row < a.length) {
                a[row][col] = num++;

                row++;
            }
            break;
        }
        return a;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        int[][] b = generateMatrix(3);
    }

}
