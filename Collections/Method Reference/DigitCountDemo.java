import java.util.Scanner;

interface DigitCounter {
    int count(int n);
}

class NumberUtil {
    public static int digitCount(int n) {
        n = Math.abs(n);

        if (n == 0)
            return 1;

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

public class DigitCountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        DigitCounter dc = NumberUtil::digitCount;

        System.out.println("Number of digits = " + dc.count(n));

        sc.close();
    }
}