package day42_collections_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Map {

    public static void main(String[] args) {

        /*
        Map'i olusturmadan once su sorularin cevaplarini belirlemeliyiz.
        1- Key hangi bilgi olacak ==> Ogrenci No
        2- Kalan bilgileri nasil tek bir value haline getiririz? ==> String olarak birlestirelim.
        3- Bilgilere daha sonra ulasabilmemiz icin, bilgileri bir duzen icinde birlestirmeliyiz.
           Bilgileri hangi sira ile birlestirelim ? ==> isim, soyisim, sinif, sube, bolum.
           Bilgilerin karismamasi icin araya nasil bir ayirac koyalim ? ==> -


         */

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");

        System.out.println(ogrenciMap);

        /*
            Map'de key ve value ayri yapilardir
            ve map'de index yapisi yoktur.
         */

        System.out.println(ogrenciMap.get(101)); // Ali-Can-10-H-MF
        System.out.println(ogrenciMap.get(102)); // Veli-Cem-10-K-TM
        System.out.println(ogrenciMap.get(1010)); // null

        System.out.println(ogrenciMap.getOrDefault(103, "Girilen numaraya sahip ogrenci yok")); // Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(107, "Girilen numaraya sahip ogrenci yok")); // Girilen numaraya sahip ogrenci yok

        ogrenciMap.putIfAbsent(103,"yeni deger"); //103 var, bir islem yapmaz.
        ogrenciMap.putIfAbsent(105,"Yigit-Han-12-K-TM"); //105 yok, bu kaydi mape ekler.

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.containsKey(104));
        System.out.println(ogrenciMap.containsKey(107));

        System.out.println(ogrenciMap.containsValue("Ali"));

        System.out.println(ogrenciMap.size());

        System.out.println(ogrenciMap.replace(103, "Ali-Han-11-P-TM"));
        System.out.println(ogrenciMap.get(103));

        System.out.println(ogrenciMap.keySet());

        System.out.println(ogrenciMap.values());



    }
}
