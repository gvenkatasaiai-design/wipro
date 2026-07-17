import java.util.Scanner;

interface Factorial {
    int factorial(int n);
}

class MathOperations {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        MathOperations obj = new MathOperations();
        Factorial f = obj::factorial;

        System.out.println("Factorial = " + f.factorial(n));

        sc.close();
    }
}