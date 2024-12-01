package day08_Emeklilik;

import java.util.Scanner;

public class C02_IndirimHesabi1 {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                     10 urun veya daha az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                     10 urun veya daha az alirsa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);

        System.out.println("urun adedini girin");
        int urunAdedi = scanner.nextInt();

        System.out.println("Indirimsiz urun fiyatini girin");
        double urunfiyat = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi E : Evet, H : Hayir");
        char kart = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = urunfiyat*urunAdedi;

        // ana degisken Kart olup olmamasi olsun

        if (kart == 'E'){ // Karti olanlar

            if (urunAdedi< 0  || urunfiyat <= 0){
                System.out.println("Urun adedi veya fiyat yanlis");
            } else if (urunAdedi == 0 ) {
                System.out.println("Bizi tercih ettiginiz icin tesekkurler, sonraki sefer yine bekleriz");
            } else if (urunAdedi > 10) {
                System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat * 80 / 100);
            } else{
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
            }

        } else if (kart == 'H') { // Karti olmayanlar

            if (urunAdedi< 0  || urunfiyat <= 0){
                System.out.println("Urun adedi veya fiyat yanlis");
            } else if (urunAdedi == 0 ) {
                System.out.println("Bizi tercih ettiginiz icin tesekkurler, sonraki sefer yine bekleriz");
            } else if (urunAdedi > 10) {
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
            } else{
                System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat * 90 / 100);
            }
        } else {
            System.out.println("Kart var mi sorusuna cevap olarak E veya H girmelisiniz...");
        }



    }
}