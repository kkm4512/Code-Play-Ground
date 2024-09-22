package localTime;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime prv = LocalTime.of(10,0,0);
        LocalTime cur = LocalTime.of(10,0,1);
        System.out.println(prv.isAfter(cur));
        System.out.println(prv.isBefore(cur));
    }
}
