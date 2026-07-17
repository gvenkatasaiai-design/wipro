import java.util.*;

public class EmployeeLinkedList {

    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee(101, "Sai", "sai@gmail.com", "Male", 50000));
        list.add(new Employee(102, "Ram", "ram@gmail.com", "Male", 60000));

        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println();
        }
    }
}