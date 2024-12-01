package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_AraliktakiAsalSayilariBulma {

    // verilen baslangic ve bitis sayilari (sinirlar dahil) arasindaki
    // asal sayilari yazdirin
    //

    public static void main(String[] args) {

        List<Integer> asalSayilar = new ArrayList<>();

        int baslangic = 12;
        int bitis = 45;

        for (int i = baslangic; i <= bitis ; i++) {

        if (C04_TamBolenlerListesi.pozitifTamBolenlerListesi(i).size()==2){

            asalSayilar.add(i);
        }
        }

        System.out.println(asalSayilar);


    }
}
