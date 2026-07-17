import java.time.Year;

public class p4 {
    public static void main(String[] args) {
        Year y = Year.now();

        if (y.isLeap())
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}