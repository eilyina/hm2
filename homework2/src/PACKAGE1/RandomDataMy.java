package PACKAGE1;
import java.util.GregorianCalendar;
import java.util.Random;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class RandomDataMy{


    public static int[] getIndexList(int n){
       // int k = 100000 +(int)( Math.random() * 200000  );
        int[] k =new int[n];
        for (int idx = 0; idx < n; ++idx){

            k[idx]= 100000+(1 +(int)( Math.random() * 100000 ));
        }
        return k;
    }


 /*   public static LocalDate randomBirthday() {
       // return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70)))); 1-й способ
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2019, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        return LocalDate.ofEpochDay(randomDay);



    }*/


}

