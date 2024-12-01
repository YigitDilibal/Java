package day06_ifStatements;

import java.util.Scanner;

public class C12_kucukHarfKontrol {

    public static void main(String[] args) {

        // Kullanicidan bir karakter isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        if (Character.isLowerCase(karakter)){
            System.out.println(Character.toUpperCase(karakter));
        }else{
            System.out.println(karakter);
        }


        // 2.yontem ASCII table degerlerini kullanalim

        if (karakter >= 'a' && karakter <= 'z'){ // kucuk harf ise
            // buyuk harf olarak yazdirin,

            System.out.println(  (char) (karakter - 32)  );
        }else {
            System.out.println(karakter);

        }



    }
}
