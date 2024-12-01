package day20_multiDimensionalArrays;

import day19_arrays.C08_ArrayeElemanEkleme;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KullaniciyaIntArrayOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan arrayin boyutunu ve elementlerini alip
        // c08'deki methodu kullanarak arrayi olusturun ve yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'de kac sayi olacagini giriniz..");

        int arrayLength = scanner.nextInt();

        int[] arr = new int[1];
        System.out.println("Lutfen array'in ilk elemanini giriniz..");
        arr[0]= scanner.nextInt();

        for (int i = 1; i < arrayLength ; i++) {

            System.out.println("array'e ekleyeceginiz sayiyi giriniz..");

            int eklenecekSayi = scanner.nextInt();

            arr = C08_ArrayeElemanEkleme.arrayaElemanEkle(arr, eklenecekSayi);

        }

        System.out.println("Olusturdugunuz arr: " + Arrays.toString(arr));



    }
}
