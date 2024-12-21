package day44_mapsUpdate_NestedMap;

public class C05_NestedOgrenciMapKullanma extends NestedMapDepo{

    public static void main(String[] args) {

        System.out.println(ogrenciNestedMap);

        // Numarasi verilen ogrencinin soyismini yazdirin

        System.out.println(ogrenciNestedMap.get(105).get("soyisim"));

        // numarası verilen ogrencının
        // soyismini verilen soyisim olarak degistirin

        ogrenciNestedMap.get(102).replace("soyisim", "Yilmaz");
        System.out.println(ogrenciNestedMap.get(102));

        // 105 numarali ogrencinin yeni bolumunu MF yapin

        ogrenciNestedMap.get(105).replace("bolum","MF");

        // numarası verilen ogrencinin sinif ve subesini degistirin

        ogrenciNestedMap.get(103).replace("sinif","11");
        ogrenciNestedMap.get(103).replace("sube","B");




    }
}
