import java.util.*;

public class Concurrent_collection {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        char c = 'a';
        for (int i = 0; i < 5; i++) {
            a.add(new String((char) (c++) + ""));

        }
        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s);
            a.add("x");
        }
    }
}
