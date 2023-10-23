class Cat {
    int j;

    Cat(int j) {
        this.j = j;
    }
}

class Dog implements Cloneable {
    Cat c;
    int i;

    Dog(Cat c, int i) {
        this.i = i;
        this.c = c;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowColne {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c = new Cat(13);
        Dog d1 = new Dog(c, 12);
        Dog d2 = (Dog) d1.clone();
        System.out.println(d1.i);
        System.out.println(d2.i);

    }
}
