package day44_mapsUpdate_NestedMap;

import day43_maps.MapDepo;

public class C02_MethodlariCalistirma extends MapDepo {

    public static void main(String[] args) {

        System.out.println(ogrenciMap);

        MapDepo.verilenBolumuYenisiyleDegistir("TM", "EA");

        System.out.println(ogrenciMap);

        System.out.println();

        MapDepo.siniflariBirYukseltme();

        System.out.println(ogrenciMap);
        MapDepo.siniflariBirYukseltme();

        System.out.println(ogrenciMap);
        MapDepo.siniflariBirYukseltme();
        System.out.println(ogrenciMap);



    }
}