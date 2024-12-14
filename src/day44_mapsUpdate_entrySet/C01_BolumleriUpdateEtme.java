package day44_mapsUpdate_entrySet;

import day43_maps.MapDepo;

import java.util.Set;

public class C01_BolumleriUpdateEtme extends MapDepo {

    public static void main(String[] args) {

        // tum ogrencileri gozden gecirip eski bolumu verilen ogrencilerin bolumunu
        // verilen yeni bolum ile update edin

        System.out.println(ogrenciMap);

        String eskiBolum = "MF";
        String yeniBolum = "Sayisal";

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        for (Integer each:ogrenciKeySet){

            String eachValue = ogrenciMap.get(each);

            String[] valueArr = eachValue.split("-");

            if (valueArr[4].equals(eskiBolum)) {

                valueArr[4] = yeniBolum;

                String yeniValue = String.join("-",valueArr);

                ogrenciMap.put(each,yeniValue);
            }
        }







    }

}
