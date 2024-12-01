package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_FibonacciSerisiOlusturma {


// bize ilk n tane tane Fibonacci sayisini bir list olarak yazdirin
// n= 5 icin  ==> 0, 1, 1, 2, 3
// n=10 icin ==> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci serisinden kac tane sayi yazdirmak isteriniz?");
        List<Integer> fibonacciSerisi = new ArrayList<>(Arrays.asList(0,1));

        int n = scanner.nextInt();

        if (n<=0){
            System.out.println("Pozitif tam sayi girmelisiniz.");
        }else if (n==1){
            System.out.println("[0]");
        }else { // girilen sayi 2 den buyuk demektir {0, 1}

            for (int i = 2; i < n ; i++) {

                fibonacciSerisi.add(fibonacciSerisi.get(i-2) + fibonacciSerisi.get(i-1));

            }
            System.out.println(fibonacciSerisi);



        }


    }


}
