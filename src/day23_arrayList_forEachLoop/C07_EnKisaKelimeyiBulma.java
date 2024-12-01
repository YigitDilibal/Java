package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C07_EnKisaKelimeyiBulma {

    public static void main(String[] args) {

        // kullanicidan bir cumle alin
        // ve cumledeki en kisa kelimeyi yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz..");

        String cumle = scanner.nextLine();

        List<String> kelimelerList = new ArrayList<>(Arrays.asList(cumle.split(" ")));

        String enKisa = kelimelerList.get(0);

        for (String each: kelimelerList){
            if (each.length()<enKisa.length()){
                enKisa=each;
            }
        }
        System.out.println(kelimelerList);
        System.out.println("En kisa kelime: " + enKisa);



    }
}
