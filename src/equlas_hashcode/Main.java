package equlas_hashcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        s1.add("a");
        s1.add("c");
        s1.add("b");
        s2.add("a");
        s2.add("b");
        s2.add("c");
        System.out.println(s1.equals(s2));
        System.out.println(Objects.deepEquals(s1, s2));
    }
}
