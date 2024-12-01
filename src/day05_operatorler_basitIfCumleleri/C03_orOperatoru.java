package day05_operatorler_basitIfCumleleri;

public class C03_orOperatoru {

    public static void main(String[] args) {

        /*
        || operatoru
         */


        boolean deger1 = false;
        boolean deger2 = false;
        boolean deger3 = false;

        int a = 10;
        int b = 15;


        //                             true.
        boolean genelSonuc = (deger1 = a<b) || (deger2=a>0) || (deger3= b>5);

        System.out.println("deger 1 : " + deger1); // true
        System.out.println("deger 2 : " + deger2); // false (true olacakti)
        System.out.println("deger 3 : " + deger3); // false (true olacakti)
        System.out.println("genel sonuc  : " + genelSonuc); // true


        // duzeltmek icin islemleri onden yapmak lazim

        deger1 = false;
        deger2 = false;
        deger3 = false;

        deger1 = a<b ;
        deger2=a>0;
        deger3= b>5;

        System.out.println("deger 1 : " + deger1); // true
        System.out.println("deger 2 : " + deger2); // true
        System.out.println("deger 3 : " + deger3); // true
        System.out.println("genel sonuc  : " + genelSonuc); // true







    }
}
