package LocalDateTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LocalDateTime {
    public static void main(String[] args) {
        List<LocalDate> lists = new ArrayList<>();
        lists.add(LocalDate.of( 2027, 12, 25 ));
        lists.add(LocalDate.of( 2055, 12, 25 ));
        lists.add(LocalDate.of( 2025, 12, 25 ));
        lists.add(LocalDate.of( 2026, 12, 25 ));
        lists.stream().sorted().forEach(System.out::println);
    }
}
