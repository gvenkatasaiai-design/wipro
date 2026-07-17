import java.util.*;
import java.util.function.Predicate;

public class PalindromeWords {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "madam","java","level","hello","radar",
                "apple","racecar","book","noon","world"));

        Predicate<String> palindrome = s ->
                s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        words.stream()
                .filter(palindrome)
                .forEach(System.out::println);
    }
}