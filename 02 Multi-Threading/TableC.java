class Table {
    void tab(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
            try {
                Thread.sleep(400);

            } catch (Exception e) {

            }
        }

    }
}

class First extends Thread {
    Table t;

    First(Table t) {
        this.t = t;
    }

    synchronized public void run() {
        t.tab(9); // here is the input example : 9
    }

}

class _2nd extends Thread {
    Table t;

    _2nd(Table t) {
        this.t = t;
    }

    public void run() {
        t.tab(5); // here is the 2nd input example : 5
    }

}

class TableC {
    public static void main(String ar[]) {
        Table tab = new Table();

        First obj = new First(tab);
        obj.setName("work-1");
        // _2nd o=new _2nd(tab);
        obj.start();
        // o.start();
    }
}
