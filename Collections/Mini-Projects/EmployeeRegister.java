import java.util.*;

class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;
    String mobile;
    String email;
    String address;

    Employee(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }
}

public class EmployeeRegister {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details:");

            System.out.print("Enter the Firstname: ");
            String fn = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String ln = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            list.add(new Employee(fn, ln, mobile, email, address));
        }

        Collections.sort(list);

        System.out.println("\nEmployee List:\n");

        System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "LastName", "Mobile", "Email", "Address");

        for (Employee e : list) {
            System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                    e.firstName, e.lastName, e.mobile, e.email, e.address);
        }

        sc.close();
    }
}