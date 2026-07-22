class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class PriorityThread {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("MAX Priority");
        MyThread t2 = new MyThread("MIN Priority");
        MyThread t3 = new MyThread("NORM Priority");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
