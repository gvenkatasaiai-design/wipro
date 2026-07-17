import java.util.*;

public class EmployeeDemo {

    static class Employee {
        int empId;
        String empName;
        String email;
        String gender;
        double salary;

        Employee(int empId, String empName, String email, String gender, double salary) {
            this.empId = empId;
            this.empName = empName;
            this.email = email;
            this.gender = gender;
            this.salary = salary;
        }

        public String toString() {
            return empId + " " + empName + " " + email + " " + gender + " " + salary;
        }
    }

    public static void main(String[] args) {

        Vector<Employee> v = new Vector<>();

        v.add(new Employee(101, "Sai", "sai@gmail.com", "Male", 50000));
        v.add(new Employee(102, "Ram", "ram@gmail.com", "Male", 60000));
        v.add(new Employee(103, "Kiran", "kiran@gmail.com", "Male", 55000));

        System.out.println("Using Iterator");
        Iterator<Employee> it = v.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing Enumeration");
        Enumeration<Employee> en = v.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}