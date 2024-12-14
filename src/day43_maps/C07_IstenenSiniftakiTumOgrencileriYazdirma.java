package day43_maps;

import java.util.Set;

public class C07_IstenenSiniftakiTumOgrencileriYazdirma extends MapDepo {

    // verilen siniftaki tum ogrencilerin
    // numara, isim, soyisim ve subelerini yazdirin.

    public static void main(String[] args) {

        int sinif = 11;

        System.out.println(ogrenciMap);

        // onceki sorularda belirli bir tek numaraya bakiyorduk
        // tum ogrencileri gozden gecirmemiz gerektiginde
        // tum ogrencilerin key'lerini kaydedip
        // bu keyleri tek tek ele alip onceki islemleri yapabiliriz

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        System.out.println(sinif+". siniftaki ogrenciler:");

        for (Integer eachKey: ogrenciKeySeti){

            String value = ogrenciMap.get(eachKey);

            String[] valueArr = value.split("-");

            if (valueArr[2].equals(sinif+ "")){
                System.out.println(eachKey+" "+valueArr[0]+ " " + valueArr[1] +" " + valueArr[3] );
            }


        }
    }


}
