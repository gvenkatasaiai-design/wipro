import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Sai", 987654321);
        contacts.put("Ram", 987654322);
        contacts.put("Kiran", 987654323);

        System.out.println("Key Exists: " + contacts.containsKey("Ram"));
        System.out.println("Value Exists: " + contacts.containsValue(987654321));

        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}