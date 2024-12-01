package day19_arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEkleme {

    public static void main(String[] args) {

       // Verilen bir array’e
        // istenen bir elemani ekleyip
        // yeni halini yazdirin


        int[] arr = {3,4,5};
        int eklenecekSayi = 8;

        arr = arrayaElemanEkle(arr,eklenecekSayi);
        arr = arrayaElemanEkle(arr,8);
        arr = arrayaElemanEkle(arr,50);


        System.out.println("Arr'nin son hali: "+Arrays.toString(arr));



    }
    public static int[] arrayaElemanEkle (int[]arr , int eklenecekSayi){
        int [] yeniArr = new int[arr.length+1]; // 0 0 0 0

        // arrdeki eski elemanlari yeni arraya kopyalayin

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];

        } // 3 4 5 0

        // yeni array'in son elemani olarak eklenecek sayiyi atayin
        yeniArr[yeniArr.length-1] = eklenecekSayi;


        // yeni array istenen hale gelince arrye yeniArray degerini atayin

        arr=yeniArr;

        return arr;


    }

}
