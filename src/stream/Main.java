package stream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String[] split = s.split(" ");
        int min = Arrays.stream(split).mapToInt(Integer::parseInt).min().orElseThrow();
        int max = Arrays.stream(split).mapToInt(Integer::parseInt).max().orElseThrow();
        String[] answer = new String[2];
        answer[0] =  String.valueOf(min);
        answer[1] =  String.valueOf(max);
        System.out.println(String.join(" ",answer));
    }
}
