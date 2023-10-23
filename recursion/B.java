public class B extends A {
    public static void main(String[] args) {
        short s = 5;
        Float f = new Float("3.0");
        int i = f.intValue();
        byte b = f.byteValue();
        double d = f.doubleValue();
        System.out.println(i + b + d);
        // System.out.println(add(s, 6));
    }
}

class A {
    int add(int j, int i) {
        return i + j;
    }
}
