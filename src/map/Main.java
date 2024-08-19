package map;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('a', !map.containsKey('a') ? 3 :  4);
        System.out.println(map);
    }
}
