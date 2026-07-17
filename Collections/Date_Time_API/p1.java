import java.time.LocalDate;

public class p1 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("Today: " + d);
        System.out.println("After 10 Days: " + d.plusDays(10));
    }
}