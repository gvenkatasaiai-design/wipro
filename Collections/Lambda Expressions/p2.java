import java.util.*;

public class p2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("C");
        al.add("C++");
        al.add("HTML");
        al.add("CSS");
        al.add("JavaScript");
        al.add("SQL");
        al.add("React");
        al.add("Spring");

        System.out.println("Original List:");
        System.out.println(al);

        System.out.println("\nStrings in Reverse Order:");

        Collections.reverse(al);

        al.forEach(word -> System.out.println(word));
    }
}