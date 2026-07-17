import java.util.*;

public class p1 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        Random r = new Random();

        // Add 25 random numbers (1 to 100)
        for (int i = 0; i < 25; i++) {
            al.add(r.nextInt(100) + 1);
        }

        System.out.println("ArrayList:");
        System.out.println(al);

        System.out.println("\nPrime Numbers:");

        al.forEach(num -> {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        });
    }

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}