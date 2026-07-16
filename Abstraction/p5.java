class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class p5 {

    public static void main(String[] args) {

        try {
            if (args.length != 2) {
                throw new InvalidAgeException(
                        "Usage: java Person <Name> <Age>");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException(
                        "Age should be greater than or equal to 18 and less than 60");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Details accepted successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Age must be an integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}