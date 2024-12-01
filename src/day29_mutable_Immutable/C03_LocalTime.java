package day29_mutable_Immutable;

import java.time.LocalTime;
import java.time.ZoneId;

public class C03_LocalTime {

    public static void main(String[] args) {


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        String s = "";

        for (int i = 0; i <3000 ; i++) {
            s +=i;

        }

        localTime=LocalTime.now();
        System.out.println(localTime);

        LocalTime japonyaSaati = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(japonyaSaati);

    }
}
