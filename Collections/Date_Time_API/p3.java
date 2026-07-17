import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter joining date (yyyy-mm-dd): ");
        LocalDate join = LocalDate.parse(sc.next());

        Period p = Period.between(join, LocalDate.now());

        System.out.println("Years: " + p.getYears());
        System.out.println("Months: " + p.getMonths());
        System.out.println("Days: " + p.getDays());

        sc.close();
    }
}