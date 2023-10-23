import java.util.*;

public class Priority_Comparator {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(15, new MyComparator());
        q.offer("A");
        q.offer("B");
        q.offer("X");
        q.offer("R");
        System.out.println(q);
    }
}

class MyComparator implements Comparator {
    public int compare(Object ob1, Object ob2) {
        String s1 = (String) ob1;
        String s2 = (String) ob2;
        return s2.compareTo(s1);
    }
}
