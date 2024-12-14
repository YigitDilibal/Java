package day43_maps;

public class C03_NumaraIleIsimSoyisimYazdirma extends MapDepo{

    public static void main(String[] args) {

        // numarasi verilen ogrencinin isim ve soyismini yazdirin

        int ogrenciNo = 105;

        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Sevgi-Cem-11-M-TM

        String[] ogrenciValueArr = ogrenciValue.split("-"); // Sevgi, Cem, 11, M, TM

        System.out.println(ogrenciNo + " numarali ogrencinin ismi ve soyismi : " + ogrenciValueArr[0] + " " + ogrenciValueArr[1]);





    }
}
