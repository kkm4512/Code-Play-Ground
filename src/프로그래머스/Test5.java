package 프로그래머스;

import java.util.stream.*;

public class Test5 {
    public static void main(String[] args) {
        String myString = "abstract algebra";
        String answer = myString.chars()
                .mapToObj(c -> (char) c)
                .map(Character::toLowerCase)
                .map(c -> c.equals('a') ? 'A' : c)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(answer);
    }
}
