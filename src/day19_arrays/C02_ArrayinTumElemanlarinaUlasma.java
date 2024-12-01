package day19_arrays;

public class C02_ArrayinTumElemanlarinaUlasma {

    public static void main(String[] args) {



    int[] sayilar = {3,5,6,7,8,9,6,5,4,6,3,4,3,4,6,7,6};

    // sayilar array'indeki tum elemanlarin toplamini yazdirin

    int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam+=sayilar[i];

        }

        System.out.println(toplam);

        // sayilar arrayinde kac adet cift sayi vardir

        int sayac = 0;


        for (int i = 0; i < sayilar.length ; i++) {

           if (sayilar[i]%2 ==0){
               sayac++;
           }

        }

        System.out.println("Array'deki cift sayi adedi: " + sayac);

        // sayilar arrayindaki tek sayilarin toplami

        toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            if (!(sayilar[i]%2 ==0)){
                toplam+=sayilar[i];
            }

        }

        System.out.println("Arraydaki Tek sayilarin toplami: "+ toplam);

        // Arraydeki en buyuk sayiyi yazdirin

        int enbuyuk = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i] > enbuyuk) {
                enbuyuk=sayilar[i];

            }
        }
        System.out.println(enbuyuk);




    }
}
