import java.util.*;

public class Navigable_Integer {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(1000);
        t.add(5000);
        t.add(4000);
        t.add(4500);
        t.add(2000);
        t.add(3300);
        System.out.println(t);
        System.out.println(t.floor(3000));
        System.out.println(t.lower(5000));
        System.out.println(t.ceiling(4000));
        System.out.println(t.higher(4500));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.descendingSet());
        System.out.println(t);
    }
}
