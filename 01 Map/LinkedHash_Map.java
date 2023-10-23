import java.util.*;

public class LinkedHash_Map {
    public static void main(String[] args) {
        LinkedHashMap m = new LinkedHashMap();
        m.put(101, "Ram");
        m.put(102, "Ram");
        m.put(103, "Ram");
        m.put(104, "Ram");
        m.put(105, "Ram");
        System.out.println(m);
        System.out.println(m.put(105, "Shiva"));
        Set s = m.keySet();
        System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s3 = m.entrySet();
        System.out.println(s3);
        Iterator itr = s3.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + "   " + m1.getValue());
            if (m1.getKey().equals(104)) {
                m1.setValue("pawan");
            }
        }
        System.out.println(m);
    }
}
