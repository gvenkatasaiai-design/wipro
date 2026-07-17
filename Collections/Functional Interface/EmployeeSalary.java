import java.util.*;
import java.util.function.Predicate;

class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Rahul",9000));
        list.add(new Employee(102,"Anu",15000));
        list.add(new Employee(103,"Kiran",8000));
        list.add(new Employee(104,"Ravi",12000));
        list.add(new Employee(105,"Sneha",7000));

        Predicate<Employee> p = e -> e.getSalary() < 10000;

        list.stream()
                .filter(p)
                .forEach(e -> System.out.println(e.getName()));
    }
}