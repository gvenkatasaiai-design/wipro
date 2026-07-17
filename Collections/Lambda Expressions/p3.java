import java.util.*;

public class p3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("C");
        al.add("HTML");
        al.add("CSS");
        al.add("Spring");
        al.add("React");
        al.add("SQL");
        al.add("Oracle");
        al.add("Angular");

        System.out.println("Original List:");
        System.out.println(al);

        System.out.println("\nStrings with Odd Length:");

        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}