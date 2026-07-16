class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class p4 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee(101, "Ma", 50000);

        Employee e2 = (Employee) e1.clone();

        // Change original object
        e1.id = 102;
        e1.name = "Sai";
        e1.salary = 60000;

        System.out.println("Original Employee:");
        e1.display();

        System.out.println("\nCloned Employee:");
        e2.display();
    }
}