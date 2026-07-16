class InvalidCountryException extends Exception {

    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

public class p4 {

    void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equals("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        p4 obj = new p4();

        try {
            // Example 1
            obj.registerUser("Mickey", "US");

            // Example 2
            // obj.registerUser("Mini", "India");

        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}