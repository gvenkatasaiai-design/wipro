class EvenThread extends Thread {

    public void run() {

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {

    public void run() {

        for (int i = 1; i < 20; i += 2) {
            System.out.println(i);
        }
    }
}

public class EvenThreadDemo {

    public static void main(String[] args) {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}
