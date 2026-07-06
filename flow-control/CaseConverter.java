package flow_control;

import java.util.Scanner;

class CaseConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch))
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        else if (Character.isUpperCase(ch))
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        else
            System.out.println("Invalid Input");

        sc.close();
    }
}