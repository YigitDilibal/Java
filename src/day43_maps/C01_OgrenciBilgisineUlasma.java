package day43_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_OgrenciBilgisineUlasma extends MapDepo {

    public static void main(String[] args) {

        /*
            1- bir ogrencinin bilgisine ulasma

                    1.adim ogrenci no ile value'ye ulasabiliriz
                    2.adim bilgilere erisebilmek icin value'yu split ederiz
                    3.adim istenen bilgileri yazdir
            2- bir ogrencinin bilgisini update etme

                    1.adim ogrenci no ile value'ye ulasabiliriz
                    2.adim bilgilere erisebilmek icin value'yu split ederiz
                    3.adim istenen bilgileri update et
                    4.degisiklik array'de yapildi, array'i birlestirip yeni value'yu bulalim
                    5.ogrenciNo ve yeniValue ile ogrenciMap'i update et
            3- tum ogrencileri gozden gecirip, istenen ozelliklerdeki ogrencilerin
               istenen ozelliklerini yazdirma

                    1.adim tum key'leri kaydet
                    2.adim herbir key'i ele almak icin for-each loop kullan
                    3.adim ogrenci no ile value'ye ulasabiliriz
                    4.adim bilgilere erisebilmek icin value'yu split ederiz
                    5.adim istenen bilgileri yazdir

            4- tum ogrencileri gozden gecirip, istenen ozelliklerdeki ogrencileri bulup
               bilgilerini verilen yeni degerlere gore update etme
         */

        List<String> isimler = new ArrayList<>(Arrays.asList("Canan","Yusuf","Seyyid","Sumeyra","Burak"));

        // Sumeyra ismini Ayse olarak update edin

        isimler.set(3,"Ayse");

        System.out.println(ogrenciMap);

        ogrenciMap.put(108,"Berkay-Yilmaz-10-K-MF");

        System.out.println(ogrenciMap);

        //103 numarali ogrencinin ismini yazdirin

        int ogrenciNo = 103;

        // 1. adim key 103 ile ogrencinin value'sine ulasabiliriz

        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        // 2. adim bilgilere ulasabilmek icin split yapalim

        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

        // 3. adim istenen bilgileri yazdir

        System.out.println(ogrenciNo + " numarali ogrencinin ismi : " + ogrenciValueArr[0]);




    }

}
