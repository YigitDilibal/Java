package day44_mapsUpdate_entrySet;

import day43_maps.MapDepo;

import java.util.Set;

public class C04_SoyisimleriBuyukHarfYap extends MapDepo {

    // tum ogrencilerin soyisimlerini tamamen buyuk harf guncelleyin.

    public static void main(String[] args) {

        System.out.println(ogrenciMap);

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        for (Integer each:ogrenciKeySet) {

            String eachValue = ogrenciMap.get(each);

            String[] valueArr = eachValue.split("-");

            valueArr[1] = valueArr[1].toUpperCase();

            String yeniValue = String.join("-", valueArr);

            ogrenciMap.put(each,yeniValue);

        }

        System.out.println(ogrenciMap);




    }

}
