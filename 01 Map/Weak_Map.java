import java.util.*;

public class Weak_Map {
    public static void main(String[] args) throws Exception {
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t, "Ram");
        System.out.println(m);
        t = null;
        Thread.sleep(5000);
        System.gc();
        System.out.println(m);
    }
}

class Temp {
    public String toString() {
        return "Temp";
    }

    public void finalize() {
        System.out.println("Finalize mtdh exicuted");
    }
}
