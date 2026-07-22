public class RaceThread extends Thread {

    private static volatile boolean raceOver = false;
    private boolean sleepHare;

    public RaceThread(String name, boolean sleepHare) {
        super(name);
        this.sleepHare = sleepHare;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            if (raceOver)
                return;

            System.out.println(getName() + " ran " + i + " meters");

            if (sleepHare && getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }

        if (!raceOver) {
            raceOver = true;
            System.out.println("\n🏆 " + getName() + " wins the race!");
        }
    }
}
