import java.util.*;

public class StringOps {

    public static void main(String[] args) {

        String s1 = "JAVAJAVAA";
        String s2 = "VA";

        ArrayList<String> list = new ArrayList<>();

        // 1. Replace alternate characters with S2
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                sb.append(s2);
            else
                sb.append(s1.charAt(i));
        }
        list.add(sb.toString());

        // 2. Replace last occurrence of S2 with reverse(S2)
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String ans = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(ans);
        } else {
            list.add(s1 + s2);
        }

        // 3. Delete first occurrence of S2
        if (first != last) {
            String ans = s1.substring(0, first) + s1.substring(first + s2.length());
            list.add(ans);
        } else {
            list.add(s1);
        }

        // 4. Divide S2 and add to beginning and end
        int mid = (s2.length() + 1) / 2;
        String ans4 = s2.substring(0, mid) + s1 + s2.substring(mid);
        list.add(ans4);

        // 5. Replace characters in S1 that are in S2 with *
        String ans5 = s1;
        for (char c : s2.toCharArray()) {
            ans5 = ans5.replace(c, '*');
        }
        list.add(ans5);

        System.out.println(list);
    }
}