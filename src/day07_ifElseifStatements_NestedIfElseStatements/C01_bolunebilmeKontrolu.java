package day07_ifElseifStatements_NestedIfElseStatements;

import java.util.Scanner;

public class C01_bolunebilmeKontrolu {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // sayi 3'e bolunuyorsa "3un kati"
        //sayi 5'e boluinuyorsa "5in kati"
        //hem 3e hem 5e bolunuyorsa "muhtesem"
        // ikisine de bolunemiyorsa "berbat"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz..");

        int sayi = scanner.nextInt();

        if(sayi % 3 == 0 & sayi % 5 == 5 ){
            System.out.println("mukemmel");
        } else if (sayi % 5 == 0) {
            System.out.println("5in kati");
        } else if (sayi % 3 == 0) {
            System.out.println("3un kati");
        }else{
            System.out.println("berbat");
        }


    }
}
