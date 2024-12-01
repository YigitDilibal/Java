package day20_multiDimensionalArrays;

import java.util.Arrays;

public class C02_ArrayHafizaKullanimi {

    public static void main(String[] args) {

        // Array'ler hafizada primitive data turlerinin degerlerini
        // non primitive data turundeki datalarin ise referanslarini barindirirlar.

        String[] isimler = {"Yusuf","Yigit","Canan"};
        int[] sayilar = {4,5,6,7};

        String[] srr = {"Metin","Mehmed","Ali","Yigit"};
        Arrays.sort(srr);

        System.out.println(Arrays.toString(srr));



    }

}
