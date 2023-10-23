import java.util.*;

public class Priority_Q {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        // System.out.println(q.element());
        for (int i = 0; i < 11; i++) {
            q.offer(i);
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
