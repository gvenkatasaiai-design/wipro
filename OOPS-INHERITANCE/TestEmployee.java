import java.util.Scanner;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String insuranceNumber;

    Employee(String name, double annualSalary, int yearStarted, String insuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.insuranceNumber = insuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Annual Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Year Started: ");
        int year = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Insurance Number: ");
        String insurance = sc.nextLine();

        Employee emp = new Employee(name, salary, year, insurance);

        System.out.println("\nEmployee Details");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("Insurance Number: " + emp.getInsuranceNumber());

        sc.close();
    }
}