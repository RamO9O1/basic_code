/**
 * OddEvenArr
 */
public class OddEvenArr {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 24 };
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {

            while (arr[left] % 2 == 0) {
                left++;
            }
            while (arr[right] % 2 == 1) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "lk");
        }
    }
}