import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");

        Iterator<Map.Entry<Object, Object>> it = p.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}