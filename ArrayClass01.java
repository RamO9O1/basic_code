import java.util.Scanner;

public class ArrayClass01 {
    public static void main(String[] args) {
        // String s1 = "I am not Hello Guy";
        // int index = 0;
        // for (int i = 0; i < s1.length(); i++) {
        // if (s1.charAt(i) == ' ') {
        // index = i;
        // }
        // }

        // String s2 = s1.substring(++index, s1.length());
        // index = 0;
        // for (int i = 0; i < s2.length(); i++) {
        // if ((s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z') || (s2.charAt(i) >= 'A' &&
        // s2.charAt(i) <= 'Z')) {
        // index++;
        // }
        // }
        // System.out.println(s2 + " -->Count : " + index);

        /**
         * to create the container to store salary of 5 emp
         */

        // double[] d = new double[5];
        // d[0] = 12388.65;
        // d[1] = 68965.56;
        // d[2] = 12985.4862;
        // d[3] = 58962.454;
        // d[4] = 5863256.458;
        // for (double a : d) {
        // System.out.println(a);
        // }
        // System.out.println((int) (Math.random() * 10000));

        /*
         * !five input take input to save name in array of 5 size
         */

        // String[] s1 = new String[5];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < s1.length; i++) {
        // System.out.println("Enter the name " + (i + 1));
        // s1[i] = sc.next();
        // }
        // for (String s : s1) {
        // System.out.println("name --> " + s);
        // }
        // sc.close();

        /*
         * write 5 std name id age;
         */

        // Scanner sc = new Scanner(System.in);
        // Student[] s1 = new Student[5];
        // for (int i = 0; i < s1.length; i++) {
        // System.out.println("Enter the ID");
        // int id = sc.nextInt();
        // System.out.println("Enter the AGE");
        // int age = sc.nextInt();
        // System.out.println("Enter the NAME");
        // String name = sc.next();
        // s1[i] = new Student(id, age, name);
        // System.out.println("Data enter--> " + (i + 1));
        // }
        // for (Student a : s1) {
        // System.out.println("id--> " + a.id + " name--> " + a.name + " age--> " +
        // a.age);
        // }
        // sc.close();

        /*
         * Write to create a emp class emp may have name sal joining date and company
         * name
         */
        // Scanner sc = new Scanner(System.in);
        // Employ[] e = new Employ[5];
        // for(int i = 0 ; i<e.length;i++){
        // System.out.println("Enter the SAL ");
        // double sal = sc.nextDouble();
        // System.out.println("Enter the Name");
        // String name = sc.next();
        // System.out.println("Enter the Joining Date");
        // String date = sc.next();
        // e[i] = new Employ(sal, name, date);
        // System.out.println("Data enter--> " + (i + 1));
        // }
        // sc.close();

        /*
         * // Write a java program to display all the element present inside array obj;
         * 
         * // Write a java program to display the element present only on even index;
         * sum of all element inside array
         * // Write a java program to display the sum of even index element of doble
         * type of array
         * 
         */
        // double[] d = new double[5];
        // d[0] = 12388.65;
        // d[1] = 68965.56;
        // d[2] = 12985.4862;
        // d[3] = 58962.454;
        // d[4] = 5863256.458;
        // int[] a = { 1, 2, 5, 6, 6, 4, 9, 5, 4, 6 };
        // int sum = 0;
        // for (int a1 : a) {
        // System.out.println(a1);
        // sum += a1;
        // }
        // System.out.println("sum of int type element--> " + sum);
        // sum = 0;
        // for (int i = 0; i < a.length; i++) {
        // if (i % 2 == 0) {
        // System.out.println(a[i]);
        // sum += a[i];
        // }
        // }
        // System.out.println("sum of int type element on even index--> " + sum);
        // double sum1 = 0;
        // for (int i = 0; i < d.length; i++) {
        // if (i % 2 == 0) {
        // sum1 += d[i];
        // }
        // }
        // System.out.println("sum of double type element on even index--> " + sum1);
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        System.out.println(find(a, 78));
    }

    public static int find(int[] a, int b) {
        int f = 0;
        int l = a.length - 1;
        int mid = l / 2;
        while (true) {
            if (a[mid] == b) {
                return a[mid];
            } else {
                if (a[mid] < b) {
                    f = mid + 1;

                } else {
                    l = mid - 1;
                }
            }
            mid = (f + l) / 2;
            if (f == l) {
                if (a[mid] == b) {
                    return b;
                }
                return -1;
            }
        }
    }

}
