import java.util.*;

public class p3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);

        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println(binary);
    }
}