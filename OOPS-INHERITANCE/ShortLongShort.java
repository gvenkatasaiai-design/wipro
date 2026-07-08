import java.util.Scanner;

public class ShortLongShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        if (a.length() < b.length()) {
            System.out.println(a + b + a);
        } else {
            System.out.println(b + a + b);
        }

        sc.close();
    }
}