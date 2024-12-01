package day30_dateTime_varargs;

import java.time.Duration;
import java.time.LocalTime;

public class C02_AradakiZamaniBulma {

    public static void main(String[] args) {


        LocalTime baslangic = LocalTime.now();


        String str = "";

        for (int i = 0; i < 100000; i++) {
            str+=i;

        }
        LocalTime bitis = LocalTime.now();


        System.out.println(baslangic);
        System.out.println(bitis);

        // 1. yontem Duration ile aradaki zamani bulabiliriz
        System.out.println(Duration.between(baslangic, bitis));

        // 2. yontem saniye olarak aradaki farki bulmak isterseniz

        System.out.println(baslangic.toSecondOfDay());
        // gece 00 00 dan baslangc anina kadar gecen zamani saniye olarak verir

        System.out.println(bitis.toSecondOfDay()-baslangic.toSecondOfDay());

        //3. yontem nanosaniye olarak

        System.out.println(bitis.toNanoOfDay()- baslangic.toNanoOfDay());

    }
}
