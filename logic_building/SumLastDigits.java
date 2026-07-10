import java.util.Scanner;

public class SumLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = Math.abs(a % 10) + Math.abs(b % 10);

        System.out.println(sum);
    }
}