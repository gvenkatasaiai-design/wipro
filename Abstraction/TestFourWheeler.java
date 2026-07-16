import com.Logan;
import com.Ford;

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan l = new Logan();
        System.out.println("Speed : " + l.speed());
        l.gps();

        Ford f = new Ford();
        System.out.println("Speed : " + f.speed());
        f.tempControl();
    }
}
