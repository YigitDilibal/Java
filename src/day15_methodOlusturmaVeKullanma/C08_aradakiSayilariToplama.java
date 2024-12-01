package day15_methodOlusturmaVeKullanma;

public class C08_aradakiSayilariToplama {

    public static void main(String[] args) {

        System.out.println(aradakiSayilariToplaDondur(80, 50));


    }

    public static int aradakiSayilariToplaDondur (int sayi, int sayi2){

        int start = sayi;
        int end = sayi2;

        int toplam = 0;

        if (end<start){

            for (int i = end; i <= start; i++) {

                toplam += i;
            }


        }else {

            for (int i = start; i <= end; i++) {

                toplam +=i;

            }

        }
        return toplam;
    }
}
