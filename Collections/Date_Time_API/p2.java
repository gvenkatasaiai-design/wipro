import java.time.DayOfWeek;
import java.time.LocalDate;

public class p2 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now().plusMonths(1).withDayOfMonth(1);

        while (d.getDayOfWeek() != DayOfWeek.SUNDAY) {
            d = d.plusDays(1);
        }

        d = d.plusWeeks(1);

        System.out.println("Second Sunday: " + d);
    }
}