import java.util.*;
import java.util.function.Predicate;

public class PerfectSquare {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(0,2,4,7,9,15,16,20,25,30));

        Predicate<Integer> square = n -> {
            int r = (int)Math.sqrt(n);
            return r * r == n;
        };

        list.stream()
                .filter(square)
                .forEach(System.out::println);
    }
}