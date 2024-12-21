package day44_mapsUpdate_NestedMap;

public class C07_NestedMapBolumListesiYazdirma extends NestedMapDepo {

    // verilen bolumdeki tum ogrencileri
    // numara, sinif, isim, soyisimlerini yazdirin.

    public static void main(String[] args) {



    for (Integer each: ogrenciNestedMap.keySet() ){

        if (ogrenciNestedMap.get(each).get("bolum").equals("TM")){

            System.out.println(each+ " " +
                    ogrenciNestedMap.get(each).get("sinif")+ " " +
                    ogrenciNestedMap.get(each).get("isim")+ " " +
                    ogrenciNestedMap.get(each).get("soyisim"));
        }
    }


    }
}
