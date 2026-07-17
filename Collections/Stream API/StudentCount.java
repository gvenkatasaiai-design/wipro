import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class StudentCount {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Amit", 75));
        list.add(new Student(2, "Priya", 45));
        list.add(new Student(3, "Kiran", 60));
        list.add(new Student(4, "Neha", 35));
        list.add(new Student(5, "Rohit", 80));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students cleared the test: " + count);
    }
}