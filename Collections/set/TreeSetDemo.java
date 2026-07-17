import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Mango");

        System.out.println("Reverse Order:");
        Iterator<String> rev = ts.descendingIterator();

        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        System.out.println("\nIterator:");
        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nContains Mango: " + ts.contains("Mango"));
        System.out.println("Contains Grapes: " + ts.contains("Grapes"));
    }
}