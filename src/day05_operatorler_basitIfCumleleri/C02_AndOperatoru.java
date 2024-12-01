package day05_operatorler_basitIfCumleleri;

public class C02_AndOperatoru {

    public static void main(String[] args) {

        boolean deger1 = true; // true
        boolean deger2 = false; // true
        boolean deger3 = true; // false
        boolean deger4 = false; // && kullanildigi icin atama yapilamadi.

        int a = 10;
        int b = 15;

        // && kullanimi.

        //                            true             true              false.
        boolean genelSonuc = (deger1= a<b) && (deger2 = a>0) && (deger3 = b<0) && (deger4 = b>10);

        System.out.println("genel sonuc : " + genelSonuc); // false
        System.out.println("deger4 : " + deger4); // false (islem tamamlansa true olacakti)

        // islem sirasinda son atama yapilmadigi icin islem kismen hizli olur
        // ancak son atamadaki islem onemli ise, o islem yapilmamis oldu.


        // & kullanimi.

        deger1 = true; // true
        deger2 = false; // true
        deger3 = true; // false
        deger4 = false; // true, bu sefer islem tamamlandigi icin atamasi gerceklesti.


        //                    true             true             false            true.
        genelSonuc = (deger1= a<b) & (deger2 = a>0) & (deger3 = b<0) & (deger4 = b>10);

        // islem odakli oldugu icin & operatoru 4 islemi de yapar
        // 4 islemi de kontrol ettigi icin &&'e gore biraz yavas olur
        // tum islemleri yaptigi icin deger 4'e dogru deger atandi.







    }
}
