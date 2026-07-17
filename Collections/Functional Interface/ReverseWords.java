import java.util.*;
import java.util.function.Consumer;

public class ReverseWords {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "java","python","html","spring","oracle",
                "react","linux","cloud","mysql","docker"));

        Consumer<ArrayList<String>> reverse = list -> {
            for(int i=0;i<list.size();i++) {
                String rev = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, rev);
            }
        };

        reverse.accept(words);

        System.out.println(words);
    }
}