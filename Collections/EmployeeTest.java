public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101, "Sai", "sai@gmail.com", "Male", 50000));
        db.addEmployee(new Employee(102, "Ram", "ram@gmail.com", "Male", 60000));

        db.displayAll();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deletion");

        db.displayAll();
    }
}