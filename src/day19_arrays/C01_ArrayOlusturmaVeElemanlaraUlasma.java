package day19_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeElemanlaraUlasma {

    public static void main(String[] args) {

        int[] arr = {3,7,9,1}; // Java arr'nin length'i olarak yazilan eleman sayisini kabul eder
        String [] isimler = new String[5]; // null, null, null, null, null

        // arr'nin data turu array'dir
        // onune yazdigimiz int, arrayin icine koyulacak elemanlarin turudur.

        // 9'u yazdirin
        System.out.println(arr[2]); // 9

        // arr'nin ilk elemanini yazdirin
        System.out.println(arr[0]); // 3

        //arr'nin 1. ve 2. index'indeki sayilarin toplamini yazdirin
        System.out.println(arr[1] + arr[2]); //16

        System.out.println(isimler[0]);

        /*
            Olusturulmus bir array'in uzunlugu sonradan degistirilemez.
         */

        int[] sayilar = {10,11,45};

        // sayilar array'inin 2. indexindeki elemani yazdirin

        System.out.println(sayilar[2]);

        // sayilar array'inin 1. indexine 40 degerini atayin.

        sayilar[1] = 40;

        // sayilar array'ine 4. element olarak 20 degerini atayin

        // sayilar[3] = 50; // ArrayIndexOutOfBoundsException

        // Sayilar array'ini yazdirin
        System.out.println(sayilar); // [I@5f184fc6

        // Array'i direkt yazdirmak isterseniz, java array'i degil referansini yazdirir
        // array'i yazdirmak icin Arrays classindan toString methodu kullanmalisiniz.

        System.out.println(Arrays.toString(sayilar));
        // array'i bir butun olarak yazdirirsaniz, elementler arasina ", " birakir.

        String str = "Java candir";
        String [] harfler = {"e","r","t"};

        System.out.println(str.length()); //11
        System.out.println(harfler.length); // 3





    }
}
