import java.util.Scanner;

public class Box {
    double width, height, depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter depth: ");
        double depth = sc.nextDouble();

        Box b = new Box(width, height, depth);

        System.out.println("Volume of Box = " + b.volume());

        sc.close();
    }
}