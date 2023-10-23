
class MyTread extends Thread {
    int count = 1;
    static int i = 1;

    public synchronized void run() {
        for (; i <= 5; i++) {
            System.out.println(currentThread().getName() + "----> " + 2 * count);
            count++;
            Thread.yield();
        }
    }
}

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        MyTread t1 = new MyTread();
        t1.setName("Work-1");
        MyTread t2 = new MyTread();
        t2.setName("Work-2");
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t2.start();

    }
}