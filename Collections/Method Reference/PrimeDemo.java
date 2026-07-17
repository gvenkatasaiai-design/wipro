import java.util.Scanner;

interface PrimeCheck {
    PrimeNumber create(int n);
}

class PrimeNumber {
    PrimeNumber(int n) {
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

public class PrimeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PrimeCheck pc = PrimeNumber::new;
        pc.create(n);

        sc.close();
    }
}