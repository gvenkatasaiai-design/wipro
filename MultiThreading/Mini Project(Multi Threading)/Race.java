public class Race {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare", false);
        RaceThread tortoise = new RaceThread("Tortoise", false);

        // Part B: Hare gets higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}
