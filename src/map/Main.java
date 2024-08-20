package map;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //["ABACD", "BCEFD"]	["ABCD","AABB"]
        String[] keymap = {"ABACD", "BCEFD"};
        HashMap<Character,Integer> map = new HashMap<>();
        for ( String s : keymap ) {
            for ( int i=0; i<s.length(); i++ ) {
                char c = s.charAt(i);
                map.put( c, !map.containsKey(c) ? i+1 : Math.min(map.get(c),i+1) );
            }
        }
        System.out.println(map);
    }
}
