import java.io.*;
import java.util.*;

public class EmployeeManagement {

    static final String FILE_NAME = "employees.dat";

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        File file = new File(FILE_NAME);

        if (file.exists()) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
                list = (ArrayList<Employee>) ois.readObject();
                ois.close();
            } catch (Exception e) {
            }
        }

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    list.add(new Employee(id, name, age, salary));

                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
                        oos.writeObject(list);
                        oos.close();
                        System.out.println("Employee added successfully.");
                    } catch (IOException e) {
                        System.out.println("Error saving employee.");
                    }

                    break;

                case 2:

                    if (list.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\n----- Employee Report -----");
                        for (Employee emp : list) {
                            System.out.println(emp);
                        }
                        System.out.println("---------------------------");
                    }

                    break;

                case 3:

                    System.out.println("Exiting the system...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}