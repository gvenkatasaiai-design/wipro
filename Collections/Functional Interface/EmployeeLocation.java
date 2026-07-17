import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class EmployeeLocation {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", "Pune", 30000));
        list.add(new Employee(102, "Anu", "Hyderabad", 35000));
        list.add(new Employee(103, "Ravi", "Chennai", 40000));
        list.add(new Employee(104, "Sneha", "Pune", 45000));
        list.add(new Employee(105, "Kiran", "Delhi", 50000));

        Function<Employee, String> fun = e -> e.location;

        ArrayList<String> locations = list.stream()
                .map(fun)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(locations);
    }
}