package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.


        System.out.println(Arrays.toString(intArrayOlustur()));

    }

    public static int[] intArrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'de kac sayi olacagini giriniz..");
        int arrayLength = scanner.nextInt();

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength ; i++) {

            System.out.println("Array'in " + i + ". indexi icin sayi veriniz..");
            arr[i] = scanner.nextInt();


        }

        return arr;





    }


}
