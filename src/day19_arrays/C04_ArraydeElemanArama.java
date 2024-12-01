package day19_arrays;

public class C04_ArraydeElemanArama {

    public static void main(String[] args) {


        //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere kullanildigini yazdirin.

        int[] sayilar = {3,5,6,7,8,9,6,5,4,6,3,4,3,4,6,7,6};

        int aranansayi = 3;

        elemanAra(sayilar,11);



    }

    public static void elemanAra(int[] sayilar, int arananSayi){

        int sayac= 0 ;

        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i]== arananSayi){
                sayac++;
            }

        }

        System.out.println(sayac==0 ? "Arrayde aranan sayi bulunmuyor." : "Aranan sayi " + sayac + " adet bulunuyor");


    }
}
