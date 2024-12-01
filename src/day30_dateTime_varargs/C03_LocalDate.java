package day30_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class C03_LocalDate {

    public static void main(String[] args) {


        // LocalDate classi da LocalTime classina benzer ozelliklere sahiptir

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate japonya = LocalDate.now(ZoneId.of("Japan"));

        LocalDate dogumTarihi1 = LocalDate.of(1999,5,10);
        System.out.println(dogumTarihi1);

        System.out.println(Period.between(dogumTarihi1, localDate));

        // 1990 artik yil mi

        System.out.println(dogumTarihi1.isLeapYear());

        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());



    }
}
