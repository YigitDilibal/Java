package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_MethodOlarak {

    public static void main(String[] args) {

        System.out.println(ilkNFibonacciSayisi(30));
        System.out.println(ustSinirdanKucukFibonacciSerisi(100));


    }

    public static List<Integer> ilkNFibonacciSayisi(int n) {

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (n <= 0) {
            return fibonacciSerisi;
        } else if (n == 1) {
            fibonacciSerisi.add(0);
            return fibonacciSerisi;
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i < n; i++) {

                fibonacciSerisi.add(fibonacciSerisi.get(i - 2) + fibonacciSerisi.get(i - 1));

            }
            return fibonacciSerisi;
        }

    }

    //Kullanicidan pozitif bir tamsayi alip,
    // o tamsayidan kucuk Fibonacci sayilarini
    // bir liste olarak bize donduren bir method olusturun.

    public static List<Integer> ustSinirdanKucukFibonacciSerisi(int ustSinir) {

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (ustSinir < 0) {
            return fibonacciSerisi;
        } else if (ustSinir == 0) {
            fibonacciSerisi.add(0);
            return fibonacciSerisi;
        } else if (ustSinir == 1) {
            fibonacciSerisi.add(0);fibonacciSerisi.add(1);fibonacciSerisi.add(1);
            return fibonacciSerisi;
        } else {
            fibonacciSerisi.add(0);fibonacciSerisi.add(1);fibonacciSerisi.add(1);
            int enBuyukFibonacciSayisi = 1;
            int siradakiIndex = 3;


            while (enBuyukFibonacciSayisi < ustSinir) {

                enBuyukFibonacciSayisi = fibonacciSerisi.get(siradakiIndex - 2) +
                        fibonacciSerisi.get(siradakiIndex - 1);

                if (enBuyukFibonacciSayisi <= ustSinir) {
                    fibonacciSerisi.add(enBuyukFibonacciSayisi);
                }

                siradakiIndex++;
            }
            return fibonacciSerisi;
        }

    }
}
