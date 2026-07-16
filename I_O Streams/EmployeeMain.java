import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeMain {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date dob = sdf.parse("15-08-2002");

            Employee emp = new Employee(
                    "Sai Ram",
                    dob,
                    "AI & ML",
                    "Software Engineer",
                    60000.0);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"));
            oos.writeObject(emp);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) ois.readObject();
            ois.close();

            System.out.println("Name: " + e.getName());
            System.out.println("Date of Birth: " + sdf.format(e.getDateOfBirth()));
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Designation: " + e.getDesignation());
            System.out.println("Salary: " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}