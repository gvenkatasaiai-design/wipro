import java.util.*;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> list = new Vector<>();

        list.add(new Employee(101, "Sai", "sai@gmail.com", "Male", 50000));
        list.add(new Employee(102, "Ram", "ram@gmail.com", "Male", 60000));

        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println();
        }
    }
}