import java.util.*;

class Card {

    String symbol;
    int number;

    Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}

public class CardsSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String, ArrayList<Card>> map = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");
            String symbol = sc.next();
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            if (!map.containsKey(symbol)) {
                map.put(symbol, new ArrayList<Card>());
            }

            map.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are :");

        for (String s : map.keySet()) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : map.keySet()) {

            ArrayList<Card> list = map.get(s);

            System.out.println("Cards in " + s + " Symbol");

            int sum = 0;

            for (Card c : list) {
                System.out.println(c.symbol + " " + c.number);
                sum += c.number;
            }

            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }
    }
}