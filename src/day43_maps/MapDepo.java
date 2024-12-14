package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {

    static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }

    public static void numaradanIsimYazdirma(int ogrenciNo){
        // 1. adim key 103 ile ogrencinin value'sine ulasabiliriz

        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        // 2. adim bilgilere ulasabilmek icin split yapalim

        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

        // 3. adim istenen bilgileri yazdir

        System.out.println(ogrenciNo + " numarali ogrencinin ismi : " + ogrenciValueArr[0]);
    }

    public static void numaradanIsimSoyisimYazdirma(int ogrenciNo){
        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Sevgi-Cem-11-M-TM

        String[] ogrenciValueArr = ogrenciValue.split("-"); // Sevgi, Cem, 11, M, TM

        System.out.println(ogrenciNo + " numarali ogrencinin ismi ve soyismi : " + ogrenciValueArr[0] + " " + ogrenciValueArr[1]);
    }

    public static void numaraIleSoyisimUpdateEt(int ogrenciNo, String yeniSoyisim){
        String eskiValue = ogrenciMap.get(ogrenciNo);

        String[] eskiValuearr = eskiValue.split("-");

        eskiValuearr[1] = yeniSoyisim;

        String yeniValue = String.join("-",eskiValuearr);

//        String yeniValue = "";

//        for (int i = 0; i < eskiValuearr.length; i++) {
//
//            yeniValue+= eskiValuearr[i]+"-";
//
//        }
//
//        int sonindex = yeniValue.lastIndexOf('-');
//        String yeniValueSt = yeniValue.substring(0,sonindex);
//        System.out.println(yeniValueSt);

        ogrenciMap.put(ogrenciNo,yeniValue);
    }

    public static void numaraIleBolumUpdate(int ogrenciNo, String yeniBolum){
        String eskiValue = ogrenciMap.get(ogrenciNo);

        String[] eskiValuearr = eskiValue.split("-");

        eskiValuearr[4] = yeniBolum;

        String yeniValue = String.join("-",eskiValuearr);

        ogrenciMap.put(ogrenciNo,yeniValue);
    }

    public static void numaraIleSinifveSubeUpdate(int ogrenciNo, int yeniSinif, String yeniSube){
        String eskiValue = ogrenciMap.get(ogrenciNo);

        String[] eskiValuearr = eskiValue.split("-");

        eskiValuearr[2] = yeniSinif + "";
        eskiValuearr[3] = yeniSube;

        String yeniValue = String.join("-",eskiValuearr);

        ogrenciMap.put(ogrenciNo,yeniValue);
    }

    public static void sinifListesiYazdir(int sinif) {
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        System.out.println(sinif + ". siniftaki ogrenciler:");

        for (Integer eachKey : ogrenciKeySeti) {

            String value = ogrenciMap.get(eachKey);

            String[] valueArr = value.split("-");

            if (valueArr[2].equals(sinif + "")) {
                System.out.println(eachKey + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);
            }
        }
    }

    public static void bolumListesiOlustur(String istenenBolum){
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

    public static void isimVeSoyisimIleOgrenciBulma(String isim, String soyisim){
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

    public static void SoyisimIleOgrenciBulma(String soyisim){
        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        System.out.println("istenen soyisimdeki ogrenciler:");

        for (Integer each: ogrenciKeySet){

            String value = ogrenciMap.get(each);

            String[] valueArr = value.split("-");

            if (valueArr[1].equals(soyisim)){
                System.out.println(each + " " + valueArr[2] +" "+ valueArr[3] +" " +valueArr[0] + " " + valueArr[1]);

            }

        }
    }



}
