import java.util.Optional;
import java.util.Scanner;

public class OptionalExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        if (address.isEmpty()) {
            address = null;
        }

        String result = Optional.ofNullable(address).orElse("India");

        System.out.println("Address: " + result);

        sc.close();
    }
}