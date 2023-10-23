import java.util.*;

public class Hash_table {
    public static void main(String[] args) {
        Hashtable h = new Hashtable(25);
        h.put(new Temp(25), "a");
        h.put(new Temp(23), "b");
        h.put(new Temp(4), "d");
        h.put(new Temp(9), "f");
        h.put(new Temp(10), "j");
        h.put(new Temp(15), "l");
        System.out.println(h);
    }
}

class Temp {
    int i;

    Temp(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i;
    }

    public String toString() {
        return i + "";
    }
}
