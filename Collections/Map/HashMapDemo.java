import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Sai");
        map.put("102", "Ram");
        map.put("103", "Kiran");

        System.out.println("Key Exists: " + map.containsKey("102"));
        System.out.println("Value Exists: " + map.containsValue("Ram"));

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}