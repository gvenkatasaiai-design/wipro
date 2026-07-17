import java.time.LocalTime;

public class p6 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();

        System.out.println("Current Time: " + t);
        System.out.println("Before 5 Hours 30 Minutes: " + t.minusHours(5).minusMinutes(30));
    }
}