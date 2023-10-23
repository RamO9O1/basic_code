import java.util.*;

public class Identity_Map {
    public static void main(String[] args) {
        IdentityHashMap m = new IdentityHashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        m.put(i1, "ram");
        m.put(i2, "ravi");
        System.out.println(m);
    }
}
