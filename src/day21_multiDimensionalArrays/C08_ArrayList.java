package day21_multiDimensionalArrays;
import day19_arrays.C08_ArrayeElemanEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C08_ArrayList {

    public static void main(String[] args) {


        int[] arr = {5,7,9};

        // bu arraye element olarak 3 ekleyin

        arr = C08_ArrayeElemanEkleme.arrayaElemanEkle(arr,3);

        System.out.println(Arrays.toString(arr)); // [5, 7, 9, 3]

        // bir de 0 ekleyin

        arr = C08_ArrayeElemanEkleme.arrayaElemanEkle(arr,0);

        // ArrayList uzunlugu degistirilebilir bir yapi olusturur.
        // Array altyapisini kullanir ama array'dan farkli bir data turudur

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar); // []

        sayilar.add(3);
        sayilar.add(67);
        sayilar.add(37);
        sayilar.add(12);

        System.out.println(sayilar); // [3, 67, 37, 12]

        sayilar.remove(1);

        System.out.println(sayilar); // [3, 37, 12]

        List<String> isimler = new ArrayList<>(Arrays.asList("Yigit", "Faig", "Ahmet"));
        System.out.println(isimler); // [Yigit, Faig, Ahmet]






    }

}
