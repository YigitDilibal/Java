package day43_maps;

import java.util.Set;

public class C10_SoyisimdenOgrenciBulma extends MapDepo{

    public static void main(String[] args) {

        String soyisim = "Can";

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
