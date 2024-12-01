package day21_multiDimensionalArrays;

public class C05_HarfinKullanimAdediniBulma {

    public static void main(String[] args) {

        // Verilen 2 katli String bir arrayde
        // tum elementleri inceleyip
        // istenen bir harfin kac defa kullanildigini yazdiran bir method olusturun

        String[][] isimler = { {"Yusuf","Emre","Faig"}, {"Yigit","Sumeyra","Ahmet"},{"Murat Emre"}};
        String arananHarf = "u";

        // output : 4

        int sayac = 0;

        for (int i = 0; i < isimler.length; i++) {

            for (int j = 0; j < isimler[i].length; j++) {

                for (int k = 0; k < isimler[i][j].length(); k++) {

                    if (isimler[i][j].charAt(k) == 'u'){

                        sayac++;
                    }
                }
            }
        }

        System.out.println("Isimler arr'sinde " + sayac + " adet 'u' harfi bulunuyor.");


    }
}
