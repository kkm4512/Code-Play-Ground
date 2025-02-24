package map;

import java.util.Hashtable;
import java.util.Map;

public class KeySetTest {
    public static void main(String[] args) {
        Map<String, String> testMap = new Hashtable<>();
        testMap.put("A", "1");
        testMap.put("A", "2");
        System.out.println("Answer : " + testMap.get("A"));
    }
}
