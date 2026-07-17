import java.util.*;

class Card {
    char symbol;
    int number;

    Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}

public class CardSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Character> set = new TreeSet<>();
        HashMap<Character, Card> map = new HashMap<>();

        int count = 0;

        while (set.size() < 4) {
            System.out.println("Enter a card:");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            count++;

            if (!set.contains(symbol)) {
                set.add(symbol);
                map.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are:");

        for (char ch : set) {
            Card c = map.get(ch);
            System.out.println(c.symbol + " " + c.number);
        }

        sc.close();
    }
}