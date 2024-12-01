package day07_ifElseifStatements_NestedIfElseStatements;

import java.util.Scanner;

public class C06_IndirimHesabi {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                     10 urun veya daha az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                     10 urun veya daha az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz urun adedini yaziniz..");
        int adet = scanner.nextInt();
        System.out.println("Lutfen aldiginiz urunun indirimsiz fiyatini yaziniz..");
        double fiyat = scanner.nextDouble();
        System.out.println("Musteri kartiniz var mi? (evet - hayir)");
        char kart= scanner.next().toLowerCase().charAt(0);

        double indirimsizFiyat = fiyat*adet;


        if (kart == 'e'){
            if (adet>10){
                System.out.println("Indirimsiz fiyat : " + indirimsizFiyat + " %20 Indirimli toplam fiyat : " + (indirimsizFiyat*80/100));
            }else {
                System.out.println("Indirimsiz fiyat : " + indirimsizFiyat + " %15 Indirimli toplam fiyat : " + (indirimsizFiyat*85/100));
            }


        } else if (kart == 'h') {
            if (adet>10){
            System.out.println("Indirimsiz fiyat : " + indirimsizFiyat + " %15 Indirimli toplam fiyat : " + (indirimsizFiyat*85/100));
        } else {
                System.out.println("Indirimsiz fiyat : " + indirimsizFiyat + " %10 Indirimli toplam fiyat : " + (indirimsizFiyat*90/100));
            }

        }

    }
}
