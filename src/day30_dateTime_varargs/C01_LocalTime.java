package day30_dateTime_varargs;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        // calistigi satirda sistemden saat bilgisini alir

        System.out.println(localTime); // 17:00:48.403761400

        LocalTime localTimeJaponya = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(localTimeJaponya); // 00:01:19.625934600

        LocalTime istenenZaman = LocalTime.of(10,20,13);
        System.out.println(istenenZaman);

        LocalTime istenenZaman2 = LocalTime.of(14,23);
        System.out.println(istenenZaman2);

        LocalTime localTimeSaniye = LocalTime.ofSecondOfDay(25456);
        System.out.println(localTimeSaniye); // 07:04:16


        System.out.println(localTime.getHour()); // 17

        // plus...() zamani ileri alir, minus...() zamani ileri alir
        System.out.println(localTime.plusHours(234).plusMinutes(23));
        System.out.println(localTime.minusMinutes(25000));

        // with..() elde edilen saatin istenen bolumunu istenen deger ile getirir.
        System.out.println(localTime.withSecond(0).withNano(0));

        System.out.println(istenenZaman.isBefore(istenenZaman2));
        System.out.println(istenenZaman2.isAfter(istenenZaman));


    }
}
