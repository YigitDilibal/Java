package day03_dataCasting_wrapperClasses;

public class C07_WrapperClassCasting {

    public static void main(String[] args) {

        /*
        Primitive data turlerinden sayisal deger icerenler
        kendí aralarinda auto widening veya explicit narrowing ile casting yapabilirler


        Ancak

        Wrapper Class'lar sadece kendileri ile ayni olan primitive'ler ile etkilesebilirler.
        farkli data turundeki wrapper class'lar arasinda casting yapilamaz.
         */

        short shrt = 45;
        int sayi = shrt; // auto widening

        long lng = 46;
        byte byt = (byte)lng; // explicit narrowing

        int sayi2 = 56;
        Integer sayi3 = sayi2; //Integer <== int Java bunu sorunsuz atama olarak kabul eder.

        int sayi4 = sayi; // int < Integer

        Short shr1 = 45;


//        Integer sayi5 = shr1;
//        Integer sayi5 = (Integer)shr1;

        // zorla cozelim

        short sayiGecis1 = shr1;
        int sayiGecis2 = sayiGecis1;

        Integer sayi6 = sayiGecis2;
        





    }
}
