package day44_mapsUpdate_NestedMap;

import day43_maps.MapDepo;

import java.util.Set;

public class C03_SiniflariArttirma extends MapDepo {

    public static void main(String[] args) {

        // yil sonu icin tum ogrencilerin siniflarini 1 arttirin
        // 12. siniftakilerin sinif bilgisi olarak Mezun yazin
        // mezun olanlara bir islem yapmayin

        System.out.println(ogrenciMap);

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        for (Integer each:ogrenciKeySet){

            String eachValue = ogrenciMap.get(each);

            String[] valueArr = eachValue.split("-");

            if (valueArr[2].equals("12")) {

                valueArr[2] = "Mezun";

                String yeniValue = String.join("-",valueArr);

                ogrenciMap.put(each,yeniValue);
            } else if (valueArr[2].equals("Mezun")) {

            }else {

                int yenisinif = Integer.parseInt(valueArr[2]);
                yenisinif++;
                valueArr[2] = yenisinif + "";

                String yeniValue = String.join("-",valueArr);

                ogrenciMap.put(each,yeniValue);

            }
        }


        System.out.println(ogrenciMap);




    }


}
