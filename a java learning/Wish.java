class Display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good moring : ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            System.out.println(name);
        }
    }

}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(String name, Display d) {
        this.d = d;

        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

class WishDemo {

    public static void main(String[] args) {
        Display d = new Display();

        MyThread t1 = new MyThread("Rammm", d);

        MyThread t2 = new MyThread("Ram", d);

        t1.start();

        t2.start();

    }
}
