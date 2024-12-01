package day13_forLoop;

import java.util.Scanner;

public class C03_AradakiSayilariToplami {

    public static void main(String[] args) {


        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
// sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
// Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen baslangic sayisini yaziniz..");
        int start = scanner.nextInt();
        System.out.println("Lutfen bitis sayisini yaziniz..");
        int end = scanner.nextInt();

        int toplam = 0;

        if (start < 0 || end < 0){
            System.out.println("Baslangic ve bitis sayilari pozitif olmali");
        } else if (start<end) {

            for (int i = start; i <= end; i++) {

                toplam += i;
            }
        }else{

                for (int i = start; i >= end ; i--) {

                    toplam+= i;

            }

        }

        System.out.println(start + " ve " + end + " arasindaki sayilarin toplami: " + toplam);




    }


}
