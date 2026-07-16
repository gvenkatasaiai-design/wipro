import com.Hero;
import com.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        System.out.println("Hero Details");
        System.out.println("Model Name: " + h1.getModelName());
        System.out.println("Registration Number: " + h1.getRegistrationNumber());
        System.out.println("Owner Name: " + h1.getOwnerName());
        System.out.println("Speed: " + h1.getSpeed());
        h1.radio();

        System.out.println();

        Honda h2 = new Honda();
        System.out.println("Honda Details");
        System.out.println("Model Name: " + h2.getModelName());
        System.out.println("Registration Number: " + h2.getRegistrationNumber());
        System.out.println("Owner Name: " + h2.getOwnerName());
        System.out.println("Speed: " + h2.getSpeed());
        h2.cdplayer();
    }
}
