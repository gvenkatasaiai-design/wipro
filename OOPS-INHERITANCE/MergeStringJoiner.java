import java.util.Scanner;
import java.util.StringJoiner;

public class MergeStringJoiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

        System.out.print("Enter number of cities for s1: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n1; i++) {
            System.out.print("City " + (i + 1) + ": ");
            s1.add(sc.nextLine());
        }

        System.out.print("Enter number of cities for s2: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n2; i++) {
            System.out.print("City " + (i + 1) + ": ");
            s2.add(sc.nextLine());
        }

        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s1);
        merge1.merge(s2);

        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s2);
        merge2.merge(s1);

        System.out.println("\ns1 merged to s2:");
        System.out.println(merge1);

        System.out.println("\ns2 merged to s1:");
        System.out.println(merge2);

        sc.close();
    }
}