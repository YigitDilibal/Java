package _KendiCozdugumProblemler;

import java.util.Scanner;

public class Problem3_VariablesAndScanner {

    public static void main(String[] args) {

        // Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Girdiginiz 2 sayinin yerlerini degisterecegim. (hem de 3. bir degisken kullanmadan) :D");

        System.out.println("Lutfen 1. sayiyi giriniz..");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2. sayiyi giriniz..");
        int sayi2 = scanner.nextInt();

        System.out.println("Değiştirilmeden önce: 1. Sayi = " + sayi1 + ", 2. Sayi = " + sayi2);

        sayi1 = sayi1 + sayi2; // sayi 1 artik ikisinin toplami oldu
        sayi2 = sayi1 - sayi2; // sayi 2 artik (toplam - sayi2) yani sayi 1 oldu.
        sayi1 = sayi1 - sayi2; // sayi 1 artik (toplam - sayi1 (sayi 2'yi sayi 1 yaptigimiz icin) sayi 2 oldu

        System.out.println("Degistirildikten sonra : Sayi1 : " + sayi1 + ", Sayi 2 : " + sayi2  );

        System.out.println("Beyinler yandi");










    }
}
