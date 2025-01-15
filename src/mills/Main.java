package mills;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Date( System.currentTimeMillis() + 3600000 * 24 )
        );
        System.out.println(System.currentTimeMillis());

    }
}
