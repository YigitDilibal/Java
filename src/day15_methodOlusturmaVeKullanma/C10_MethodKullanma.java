package day15_methodOlusturmaVeKullanma;

public class C10_MethodKullanma {

    public static void main(String[] args) {

        // 8! degerini hesaplayin

        C01_FaktoryelYazdirma.faktoriyelyazdir(8);

        // kullanicidan pozitif bir tamsayi alip rakamlar toplamini yazdirin


        int sayi = 1453;

        C02_SayininRakamlarToplaminiBulma.sayininrakamlartoplami(sayi); // 13

        C03_MetniTerstenYazdirma.metniTerstenYazdir("Yavas yavas anlamaya basliyoruz");
        //zuroyilsab ayamalna savay savaY

        System.out.println("");

        //verilen metnin tersini kaydedin
        String isim = "Nihad";

        //String tersMetin= C03_MetniTerstenYazdirma.metniTerstenYazdir(isim);
        //esitligin sag tarafinda kullandigimiz method void yani sonuc dondurmuyor
        // halbuki atama islemi sag tarafta bir deger olmasini gerektirir
        // sag tarafta deger olmayinca Jaca CTE verir




        String tersMetin = C04_PalindromeMu.metninTersiniDondur(isim);
        System.out.println(tersMetin);

        System.out.println(C04_PalindromeMu.metninTersiniDondur("Bu daha iyimis"));

        /*
        void olan method sadece yazdirir
        ama kaydetmemiz gerekirse ISE YARAMAZ

        buna karsilik
        deger donduren (return) methodlar degeri getirir
        biz istersek kaydereriz
        istersek de hemen yazdirabiliriz

        String method'larini incelerseniz
        neredeyse tamaminin return type inin oldugunu gorursunuz

         */

        // 100 ile 200 arasindaki sayilari toplayip yazdirin

        System.out.println(C08_aradakiSayilariToplama.aradakiSayilariToplaDondur(100, 200));


    }
}
