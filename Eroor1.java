public class Eroor1 {
    public static void main(String[] args) {
        try {
            try {
                throw new A("This an Erroe");
            } catch (A e) {
                System.out.println("Catch 1");
            }
        } catch (ArithmeticException e) {
            System.out.println("Catch 2323");
        }

    }
}

class A extends ArithmeticException {
    A(String s) {
        super(s);
    }
}
