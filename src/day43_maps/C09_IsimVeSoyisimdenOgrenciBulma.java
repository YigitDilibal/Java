package day43_maps;

import java.util.Set;

public class C09_IsimVeSoyisimdenOgrenciBulma extends MapDepo{

    // ismi ve soyismi verilen ogrencinin
    // numara, sinif, sube, isim ve soyisim bilgerini liste olarak yazdirin

    public static void main(String[] args) {



    String isim = "Ali";
    String soyisim = "Can";

    Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        System.out.println("istenen isim soyisimdeki ogrenci:");

        for (Integer each: ogrenciKeySet){

        String value = ogrenciMap.get(each);

        String[] valueArr = value.split("-");

        if (valueArr[0].equals(isim) && valueArr[1].equals(soyisim)){
            System.out.println(each + " " + valueArr[2] +" "+ valueArr[3] +" " +valueArr[0] + " " + valueArr[1]);

        }

    }

}
}
