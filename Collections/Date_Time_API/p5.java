import java.time.LocalTime;

public class p5 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();

        System.out.println("Current Time: " + t);
        System.out.println("After 25 Minutes: " + t.plusMinutes(25));
    }
}