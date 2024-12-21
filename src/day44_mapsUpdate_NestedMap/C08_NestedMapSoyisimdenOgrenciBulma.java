package day44_mapsUpdate_NestedMap;

public class C08_NestedMapSoyisimdenOgrenciBulma extends NestedMapDepo {

    public static void main(String[] args) {

        // Verilen soyisme sahip ogrencilerin
// numara, sinif, sube , isim ve soyisimlerini yazdirin

        String verilenSoyisim = "Can";

        for (Integer each: ogrenciNestedMap.keySet() ){

            if (ogrenciNestedMap.get(each).get("soyisim").equals(verilenSoyisim)){

                System.out.println(each+ " " +
                        ogrenciNestedMap.get(each).get("sinif")+ " " +
                        ogrenciNestedMap.get(each).get("sube")+ " " +
                        ogrenciNestedMap.get(each).get("isim")+ " " +
                        ogrenciNestedMap.get(each).get("soyisim"));
            }
        }




    }
}
