import java.util.*;

class NegativeMarksException extends Exception {
    public NegativeMarksException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class p3 {

    public static void checkMarks(int mark)
            throws NegativeMarksException, OutOfRangeException {

        if (mark < 0)
            throw new NegativeMarksException("Marks cannot be negative");
        if (mark > 100)
            throw new OutOfRangeException("Marks should be between 0 and 100");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student " + i + " Name:");
                String name = sc.nextLine();

                int sum = 0;

                System.out.println("Enter marks in 3 subjects:");
                for (int j = 1; j <= 3; j++) {
                    int mark = Integer.parseInt(sc.nextLine());

                    checkMarks(mark);

                    sum += mark;
                }

                double avg = sum / 3.0;

                System.out.println("Student Name: " + name);
                System.out.println("Average Marks: " + avg);
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integers.");
        } catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}