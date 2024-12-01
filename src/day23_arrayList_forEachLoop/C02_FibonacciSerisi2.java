package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_FibonacciSerisi2 {

    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi alip,
        // o tamsayidan kucuk Fibonacci sayilarini
        // bir liste olarak bize donduren bir method olusturun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("fibonacci serisini yazdirmak icin ust siniri giriniz.");
        int ustSinir = scanner.nextInt();

        List<Integer> fibonacciSerisi = new ArrayList<>(Arrays.asList(0,1,1));

        if (ustSinir<0){
            System.out.println("Fibonacci sayilari pozitif tamsayilardir");
        } else if (ustSinir==0) {
            System.out.println("[0]");
        } else if (ustSinir==1) {
            System.out.println(fibonacciSerisi);
        }else { // ust sinir 1den buyuk bir tamsayi

            int enBuyukFibonacciSayisi = 1;
            int siradakiIndex = 3;

            while (enBuyukFibonacciSayisi<ustSinir){

                enBuyukFibonacciSayisi = fibonacciSerisi.get(siradakiIndex-2) +
                                         fibonacciSerisi.get(siradakiIndex-1);

                if (enBuyukFibonacciSayisi<=ustSinir){
                    fibonacciSerisi.add(enBuyukFibonacciSayisi);
                }

                siradakiIndex++;

            }

            System.out.println(fibonacciSerisi);

        }


    }
}
