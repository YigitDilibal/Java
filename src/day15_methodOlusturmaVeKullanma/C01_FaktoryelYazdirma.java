package day15_methodOlusturmaVeKullanma;

public class C01_FaktoryelYazdirma {

    public static void main(String[] args) {


        // kullanicidan 17'den kucuk bir pozitif tamsayiyı parametre olarak alip
        // faktoryel degerini yazdiran bi method olusturun



        faktoriyelyazdir(5);


    }

    public static void faktoriyelyazdir (int sayi){
        long carpim = 1;

        for (int i = sayi; i >=1 ; i--) {

            carpim *= i;

        }

        System.out.println(sayi + "! = " + carpim);
    }


}
