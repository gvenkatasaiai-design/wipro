import java.util.*;

public class EmployeeHashSet {
    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Sai");
        employees.add("Ram");
        employees.add("Kiran");
        employees.add("Ravi");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}