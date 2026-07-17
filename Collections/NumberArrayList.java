import java.util.*;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(10);
        list.add(25.5);
        list.add(35.75f);
        list.add(100L);

        for (Number n : list) {
            System.out.println(n);
        }
    }
}