import java.util.Optional;

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String msg) {
        super(msg);
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class OptionalExample3 {

    public static void main(String[] args) {

        Employee emp = null;

        try {
            Optional<Employee> value = Optional.ofNullable(emp);

            if (value.isPresent()) {
                System.out.println("Employee Name: " + value.get().name);
            } else {
                throw new InvalidEmployeeException("Employee is null");
            }

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}