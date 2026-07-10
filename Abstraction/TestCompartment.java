import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class: Travel comfortably.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for women passengers.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment: Please maintain cleanliness.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: Only luggage is allowed.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] c = new Compartment[10];
        Random r = new Random();

        for (int i = 0; i < c.length; i++) {
            int n = r.nextInt(4) + 1;

            switch (n) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("Compartment " + (i + 1));
            System.out.println(c[i].notice());
            System.out.println();
        }
    }
}