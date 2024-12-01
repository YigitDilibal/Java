package day08_Emeklilik;

import java.util.Scanner;

public class C08_NestedTernary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // sayi pozitifse cift sayi olup olmadigini yazdirin
        // sayi pozitif degilse 3un kati olup olmadigini


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz..");
        int sayi = scanner.nextInt();

        System.out.println(sayi>0 ?   sayi%2==0 ? "Cift sayi" : "Tek sayi"   :   sayi%3==0 ? "3un kati" : "3un kati degil"   );




    }
}
