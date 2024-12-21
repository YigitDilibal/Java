package day44_mapsUpdate_NestedMap;

public class C06_NestedMapListeYazdirma extends NestedMapDepo {

    public static void main(String[] args) {

        // verilen siniftaki tum ogrencilerin
        // numara, isim, soyisim ve subelerini yazdirin

        for (Integer each: ogrenciNestedMap.keySet() ){

            if (ogrenciNestedMap.get(each).get("sinif").equals("11")){

                        System.out.println(each+ " " +
                        ogrenciNestedMap.get(each).get("isim")+ " " +
                        ogrenciNestedMap.get(each).get("soyisim")+ " " +
                        ogrenciNestedMap.get(each).get("sube"));
            }
        }



    }


}
