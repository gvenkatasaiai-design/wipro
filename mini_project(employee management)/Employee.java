import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID : " + id +
               "\nEmployee Name : " + name +
               "\nEmployee Age : " + age +
               "\nEmployee Salary : " + salary + "\n";
    }
}