import java.util.Scanner;

public class Calculator {

    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter power: ");
        int b = sc.nextInt();

        System.out.println("Result (Integer): " + powerInt(a, b));

        System.out.print("Enter a decimal number: ");
        double x = sc.nextDouble();

        System.out.print("Enter power: ");
        int y = sc.nextInt();

        System.out.println("Result (Double): " + powerDouble(x, y));

        sc.close();
    }
}