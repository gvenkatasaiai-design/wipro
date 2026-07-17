import java.util.*;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (e.empId == empId) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Salary of " + e.empName + " = " + e.salary;
            }
        }
        return "Employee Not Found";
    }

    public void displayAll() {
        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101, "Sai", "sai@gmail.com", "Male", 50000));
        db.addEmployee(new Employee(102, "Ram", "ram@gmail.com", "Male", 60000));

        db.displayAll();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");
        db.displayAll();
    }
}