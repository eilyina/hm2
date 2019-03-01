package PACKAGE1;

import java.time.LocalDate;
import java.util.Random;

public interface RandomData {

    public static LocalDate randomBirthday() {
        // return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70)))); 1-й способ
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2019, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        return LocalDate.ofEpochDay(randomDay);



    }
}
