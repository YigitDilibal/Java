package day43_maps;

import java.util.Set;

public class C08_BolumListesiYazdir extends MapDepo{

    public static void main(String[] args) {

        // verilen bolumdeki tum ogrencileri
        // numara, sinif, isim, soyisimlerini yazdirin.

        String istenenBolum = "TM";

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        System.out.println(istenenBolum + " Bolumundeki ogrenci listesi");

        for (Integer each: ogrenciKeySet){

            String value = ogrenciMap.get(each);

            String[] valueArr = value.split("-");

            if (valueArr[4].equals(istenenBolum)){
                System.out.println(each + " " + valueArr[2] + " " +valueArr[0] + " " + valueArr[1]);

            }

        }


    }
}
