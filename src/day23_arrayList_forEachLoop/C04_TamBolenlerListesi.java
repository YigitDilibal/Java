package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_TamBolenlerListesi {

    //Verilen pozitif bir tamsayiyi,
    // tam bolebilen tum pozitif tamsayilari
    // bir liste olarak bize donduren bir method olusturun.
    public static void main(String[] args) {

        System.out.println(pozitifTamBolenlerListesi(30));

        System.out.println(pozitifTamBolenlerListesi(103));

    }

    public static List<Integer> pozitifTamBolenlerListesi (int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0){
                tamBolenlerListesi.add(i);
            }
        }

        return tamBolenlerListesi;

    }

}

