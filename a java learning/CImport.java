import java.io.*;

class CImport {
    public static void main(String[] args) {
        Console cn = System.console();
        int n;
        System.out.println("Enter the number ");
        n = Integer.parseInt(cn.readLine());
        System.out.println("number " + n);

    }
}