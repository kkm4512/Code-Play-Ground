package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1","2");
        List<String> result2 = strings.stream().collect(Collectors.toUnmodifiableList());
    }
}
