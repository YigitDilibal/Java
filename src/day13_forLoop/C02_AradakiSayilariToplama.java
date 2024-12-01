package day13_forLoop;

import java.util.Scanner;

public class C02_AradakiSayilariToplama {


    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
// sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
// Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen baslangic sayisiniz yaziniz..");
        int start = scanner.nextInt();
        System.out.println("Lutfen bitis sayisiniz yaziniz..");
        int end = scanner.nextInt();

        int toplam = 0;

        if (end<start){
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");
        }else {

            for (int i = start; i <= end; i++) {

                toplam +=i;

            }

            System.out.println(start + " ve " + end + " arasindaki sayilarin toplami: " + toplam);

        }



    }

}
